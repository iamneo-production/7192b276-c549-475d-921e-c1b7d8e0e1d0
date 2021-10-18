package com.examly.springapp.service;

import com.examly.springapp.entity.CredentialVaultModel;
import com.examly.springapp.dao.CredentialVaultRepo;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CredentialVaultService {

    @Autowired
    CredentialVaultRepo credentialRepo;

    public List<CredentialVaultModel> getCredentialInfo(){
        return (List<CredentialVaultModel>) credentialRepo.findAll();
    }

    public CredentialVaultModel credentialInfoById(String id) throws NotFoundException {
        Optional<CredentialVaultModel> credential = credentialRepo.findById(id);
        return credential.orElseThrow(() -> new NotFoundException("Couldn't find a Credential with id: " + id));
    }

    public String credentialInfoSave(CredentialVaultModel credential){
        try{
            credentialRepo.save(credential);
            return "Information Added Successfully";
        }
        catch (Exception e){
            System.out.println("\n\nError while adding Credential : " +e+"\n\n");
            return "false";
        }
    }

    public String credentialInfoDelete(String id){
        try{
            credentialRepo.deleteById(id);
            return "Information Deleted";
        } catch (Exception e){
            System.out.println("\n\nError while deleting Credential : " +e+ "\n\n");
            return "false";
        }
    }

    public String credentialInfoEditSave(String id, CredentialVaultModel credential){
        try{
            CredentialVaultModel model = credentialRepo.getOne(id);

            model.setSourceName(credential.getSourceName());
            model.setUsername(credential.getUsername());
            model.setPassword(credential.getPassword());

            return "Information Updated";
        }
        catch (Exception e){
            System.out.println("\n\nError while updating Credential : " +e+ "\n\n");
            return "False";
        }
    }
}
