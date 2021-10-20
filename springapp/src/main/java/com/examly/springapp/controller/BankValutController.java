package com.examly.springapp.controller;

import com.examly.springapp.entity.BankValutModel;
import com.examly.springapp.service.BankValutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/bank")
public class BankValutController {

    @Autowired
    BankValutService bankService;

    @GetMapping("/bank")
    public List<BankValutModel> getBankInfo(){
        return bankService.getBankInfo();
    }

    @PostMapping("/bank/{id}")
    public String bankInfoSave(@RequestBody BankValutModel bank){
        return bankService.bankInfoSave(bank);
    }

    @DeleteMapping("/bank/{id}")
    public String bankInfoDelete(@PathVariable Long id){
        return  bankService.bankInfoDelete(id);
    }

    @PutMapping("/bank/{id}")
    public String bankInfoEditSave(@PathVariable Long id, @RequestBody BankValutModel bank){
        return bankService.bankInfoEditSave(id, bank);
    }

}