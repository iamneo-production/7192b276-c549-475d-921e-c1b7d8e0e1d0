package com.examly.springapp.controller;

import com.examly.springapp.entity.CredentialValutModel;
import com.examly.springapp.service.CredentialValutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/credentials")
public class CredentialValutController {

//    @Autowired
    CredentialValutService credentialService;

    @GetMapping("/credentials")
    public List<CredentialValutModel> getCredentialInfo(){
        return credentialService.getCredentialInfo();
    }

//    @PostMapping("/credentials-save")
//    public String credentialInfoSave(@PathVariable String id, @RequestBody CredentialValutModel credential){
//        return credentialService.credentialInfoSave(credential);
//    }
    @PostMapping("/credentials")
    public String credentialInfoSave(@RequestBody CredentialValutModel credential){
        return credentialService.credentialInfoSave(credential);
    }

    @PutMapping("/credentials/{id}")
    public String credentialInfoEditSave(@PathVariable Long id, @RequestBody CredentialValutModel credential){
        return credentialService.credentialInfoEditSave(id, credential);
    }

    @DeleteMapping("/credentials/{id}")
    public String credentialInfoDelete(@PathVariable Integer id){
        return  credentialService.credentialInfoDelete(id);
    }



}