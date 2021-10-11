package com.examly.springapp.controller;

import com.examly.springapp.model.BankVaultModel;
import com.examly.springapp.service.BankVaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankVaultController {
    @Autowired
    BankVaultService bankService;

    @GetMapping
    public List<BankVaultModel> getBankInfo(){
        return bankService.getBankInfo();
    }

    @PostMapping("/{id}")
    public String bankInfoSave(@PathVariable long id, @RequestBody BankVaultModel bank){
        return bankService.bankInfoSave(bank);
    }

    @DeleteMapping("/{id}")
    public String bankInfoDelete(@PathVariable String id){
        return  bankService.bankInfoDelete(id);
    }

    @PutMapping("/{id}")
    public String bankInfoEditSave(@PathVariable String id, @RequestBody BankVaultModel bank){
        return bankService.bankInfoEditSave(id, bank);
    }

}
