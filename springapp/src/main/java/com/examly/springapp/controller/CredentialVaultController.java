package com.examly.springapp.controller;

import com.examly.springapp.entity.CredentialVaultModel;
import com.examly.springapp.service.CredentialVaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credentials")
public class CredentialVaultController {
    @Autowired
    CredentialVaultService credentialService;

    @GetMapping("/info")
    public List<CredentialVaultModel> getCredentialInfo(){
        return credentialService.getCredentialInfo();
    }

    @PostMapping("/new/{id}")
    public String credentialInfoSave(@PathVariable String id, @RequestBody CredentialVaultModel credential){
        return credentialService.credentialInfoSave(credential);
    }

    @DeleteMapping("/delete/{id}")
    public String credentialInfoDelete(@PathVariable String id){
        return  credentialService.credentialInfoDelete(id);
    }

    @PutMapping("/update/{id}")
    public String credentialInfoEditSave(@PathVariable String id, @RequestBody CredentialVaultModel credential){
        return credentialService.credentialInfoEditSave(id, credential);
    }

}