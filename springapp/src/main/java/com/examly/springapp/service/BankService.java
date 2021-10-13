package service;

import repo.BankRepo;
import model.BankValutModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {

    @Autowired
    private BankRepo bankRepo ;
    public List<BankValutModel> getBankInfo(){
        return bankRepo.findAll() ;
    }
}
