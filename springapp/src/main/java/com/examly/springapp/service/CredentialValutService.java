package com.examly.springapp.service;

import com.examly.springapp.dao.UserDao;
import com.examly.springapp.entity.CredentialValutModel;
import com.examly.springapp.dao.CredentialValutRepo;
import com.examly.springapp.entity.UserModel;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CredentialValutService {

    @Autowired
    CredentialValutRepo credentialRepo;
    @Autowired
    UserDao userDao;

    public List<CredentialValutModel> getCredentialInfo(){
        return (List<CredentialValutModel>) credentialRepo.findAll();
    }

//    public CredentialValutModel credentialInfoById(Integer id) throws NotFoundException {
//        CredentialValutModel credential = credentialRepo.findById(id);
//        return credential;
//    }

    public String credentialInfoSave( CredentialValutModel credential){
        try{
            // UserModel user = userDao.getOne(id);
            // credential.setUser(user);
            credentialRepo.save(credential);
            return "Information Added Successfully";
        }
        catch (Exception e){
            System.out.println("\n\nError while adding Credential : " +e+"\n\n");
            return "false";
        }
    }

    public String credentialInfoDelete(Integer id){
        try{
            credentialRepo.deleteById(id);
            return "Information Deleted";
        } catch (Exception e){
            System.out.println("\n\nError while deleting Credential : " +e+ "\n\n");
            return "false";
        }
    }

    public String credentialInfoEditSave(Long id, CredentialValutModel credential){
        try{
            UserModel user = userDao.getOne(id);
//            CredentialValutModel model = credentialRepo.findById(user.getUserId());

//            model.setSourceName(credential.getSourceName());
//            model.setUsername(credential.getUsername());
//            model.setPassword(credential.getPassword());

            return "Information Updated";
        }
        catch (Exception e){
            System.out.println("\n\nError while updating Credential : " +e+ "\n\n");
            return "False";
        }
    }
}