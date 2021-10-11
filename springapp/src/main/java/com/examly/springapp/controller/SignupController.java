package controller;



import model.*;
import service.*;
import repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
// @CrossOrigin("*")
public class SignupController {


    @Autowired
    private UserService service;

    
    @PostMapping ( "/signup")
    @CrossOrigin(origins = "https://8081-ddebdbcdadaeefefcfbefdaaebbaacaca.examlyiopb.examly.io/signup")
    public UserModel saveUser( @RequestBody  UserModel user) throws Exception
    {
        String  tempEmailId = user.getEmail();

        if(tempEmailId !=null &&  !"".equals(tempEmailId))
        {
            UserModel userObj = service.fetchUserByEmail(tempEmailId);
            if(userObj !=null)
            {
                throw  new Exception("already present");
            }
        }
        UserModel userObj = null;
        userObj = service.saveUserDetails(user);
        return userObj;
    }
    

    @PostMapping ( "/login")
    @CrossOrigin(origins = "https://8081-ddebdbcdadaeefefcfbefdaaebbaacaca.examlyiopb.examly.io/login")
    public UserModel loginUser(@RequestBody UserModel user) throws Exception
    {
        String tempEmailId = user.getEmail();
        String tempPass = user.getPassword();
        UserModel userObj = null;
        if(tempEmailId !=null && tempPass !=null)
        {
           userObj =  service.fetchUserByEmailAndPassword(tempEmailId , tempPass);
        }

        if(userObj ==null)
        {
            throw new Exception("does not exist");
        }
        return userObj;
    }
}
