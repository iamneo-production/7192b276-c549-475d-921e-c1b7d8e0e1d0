
package controller;


import model.*;
import service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BankValutController {


    @Autowired
    private BankService bankService;


    @GetMapping("/bank")
    public List<BankValutModel> getBankInfo(){
        List<BankValutModel> bankInfo = new ArrayList<>();
        bankInfo = bankService.getBankInfo();
        return bankInfo;
    }

}
