package com.examly.springapp.service;

import com.examly.springapp.entity.BankValutModel;
import com.examly.springapp.dao.BankValutRepo;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BankValutService {

    @Autowired
    BankValutRepo bankRepo;

    public List<BankValutModel> getBankInfo(){
        return (List<BankValutModel>) bankRepo.findAll();
    }

    public BankValutModel bankInfoById(Long id) throws NotFoundException {
        Optional<BankValutModel> bank = bankRepo.findById(id);
        return bank.orElseThrow(() -> new NotFoundException("Couldn't find a Bank with id: " + id));
    }

    public String bankInfoSave(BankValutModel bank){
        try{
            bankRepo.save(bank);
            return "Information Added Successfully";
        }
        catch (Exception e){
            System.out.println("\n\nError while adding bank : " +e+"\n\n");
            return "false";
        }
    }

    public String bankInfoDelete(Long id){
        try{
            bankRepo.deleteById(id);
            return "Information Deleted";
        } catch (Exception e){
            System.out.println("\n\nError while deleting bank : " +e+ "\n\n");
            return "false";
        }
    }

    public String bankInfoEditSave(Long id, BankValutModel bank){
        try{
            BankValutModel model = bankRepo.getOne(id);

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