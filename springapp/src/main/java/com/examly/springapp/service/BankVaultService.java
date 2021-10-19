package com.examly.springapp.service;

import com.examly.springapp.model.BankVaultModel;
import com.examly.springapp.repo.BankVaultRepo;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BankVaultService {

    @Autowired
    BankVaultRepo bankRepo;

    public List<BankVaultModel> getBankInfo(){
        return (List<BankVaultModel>) bankRepo.findAll();
    }

    public BankVaultModel bankInfoById(String id) throws NotFoundException {
        Optional<BankVaultModel> bank = bankRepo.findById(Long.parseLong(id));
        return bank.orElseThrow(() -> new NotFoundException("Couldn't find a Bank with id: " + id));
    }

    public String bankInfoSave(BankVaultModel bank){
        try{
            bankRepo.save(bank);
            return "Information Added Successfully";
        }
        catch (Exception e){
            System.out.println("\n\nError while adding bank : " +e+"\n\n");
            return "false";
        }
    }

    public String bankInfoDelete(String id){
        try{
            bankRepo.deleteById(Long.parseLong(id));
            return "Information Deleted";
        } catch (Exception e){
            System.out.println("\n\nError while deleting bank : " +e+ "\n\n");
            return "false";
        }
    }

    public String bankInfoEditSave(String id, BankVaultModel bank){
        try{
            BankVaultModel model = bankRepo.getOne(Long.parseLong(id));

            model.setAccountName(bank.getAccountName());
            model.setIfsc(bank.getIfsc());
            model.setAccountNumber(bank.getAccountNumber());
            model.setUsername(bank.getUsername());
            model.setPassword(bank.getPassword());

            return "Information Updated";
        }
        catch (Exception e){
            System.out.println("\n\nError while updating bank : " +e+ "\n\n");
            return "False";
        }

    }
}
