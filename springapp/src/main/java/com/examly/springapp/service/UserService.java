package service;


import model.*;
import repo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public UserModel saveUserDetails(UserModel user)
    {
        return repo.save(user);
    }


    public UserModel fetchUserByEmail(String email)
    {
        return repo.findByEmailId(email);
    }
    public UserModel fetchUserByEmailAndPassword(String email , String password)
    {
        return repo.findByEmailIdandAndPassword(email,password);
    }

}
