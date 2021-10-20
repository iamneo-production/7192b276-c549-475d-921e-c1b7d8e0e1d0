package com.examly.springapp.controller;

import com.examly.springapp.dao.UserDao;
import com.examly.springapp.entity.UserModel;
import com.examly.springapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class SignupController {

    
    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;

    @PostConstruct
    public void initRoleAndUser() {
        userService.initRoleAndUser();
    }

    @PostMapping({"/signup"})
    public UserModel registerNewUser(@RequestBody UserModel userModel) throws Exception{
        UserModel local = this.userDao.findByEmail(userModel.getEmail());
        if(local != null)
        {
            System.out.println("User is alredy present");
            throw new Exception("User is already present");
        }else{
            local = this.userDao.save(userModel);
        }


        return userService.saveUser(local);
    }


//    @PostMapping("/signup")
//    public UserModel saveUser(@RequestBody UserModel userModel) {
//
//        return userService.saveUser(userModel);
//    }



    @PutMapping("/admin/update/{id}")
    public UserModel updateUser(@PathVariable(name = "id") String id , @RequestBody UserModel userModel) {
        return userService.updateUser(userModel);
    }

    @GetMapping("/admin/user")
    public List<UserModel> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/admin/user/{id}")
    public UserModel getUser(@PathVariable(name = "id") Long id) {
        return userService.getUser(id);
    }

    @DeleteMapping("/admin/delete/{id}")
    public void deleteUser(@PathVariable(name = "id") Long id) {
        userService.deleteUser(id);
    }
}