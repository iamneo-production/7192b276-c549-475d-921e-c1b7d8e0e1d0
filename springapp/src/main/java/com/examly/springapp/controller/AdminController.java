package com.examly.springapp.controller;



import com.examly.springapp.entity.UserModel;
import com.examly.springapp.service.MediaValutService;
import com.examly.springapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AdminController {

//    @Autowired
    private UserService userService;


//    @PutMapping("/update-admin")
//    public UserModel updateUser(@RequestBody UserModel user) {
//        UserModel existUser = userService.findById(user.getUserId());
//        if (existUser != null && !existUser.getEmail().equals(user.getEmail())) {
//            return userService.updateUser(user);
//        }
//        return userService.updateUser(user);
//    }

//    //This can be also @DeleteMapping.
//    @DeleteMapping("/admin/delete/{id}")
//    public ResponseEntity<?> deleteUser(@RequestBody UserModel user){
//        userService.deleteUser(user.getEmail());
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

    @GetMapping("/admin")
    public List<UserModel> findAllUsers(){
        return userService.findAllUsers();
    }






//    @GetMapping("/api/admin/product-number")
//    public ResponseEntity<?> numberOfCredentials(){
//        Long number = productService.numberOfCredentials();
//        StringResponse response = new StringResponse();
//        response.setResponse(number.toString());
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }


}
