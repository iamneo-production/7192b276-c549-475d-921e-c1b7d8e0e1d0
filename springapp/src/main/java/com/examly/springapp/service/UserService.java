package com.examly.springapp.service;

//import com.examly.springapp.dao.RoleDao;
import com.examly.springapp.dao.UserDao;
import com.examly.springapp.entity.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

//    @Autowired
//    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void initRoleAndUser() {

    //    UserModel adminUserModel = new UserModel();
    //    adminUserModel.setEmail("admin");
    //    adminUserModel.setPassword(getEncodedPassword("admin"));
    //    adminUserModel.setMobileNumber("123");
    //    adminUserModel.setRole("Admin");
    //    userDao.save(adminUserModel);


    }

    public UserModel saveUser(UserModel userModel) {

        userModel.setRole("User");
        userModel.setPassword(getEncodedPassword(userModel.getPassword()));

        return userDao.save(userModel);
    }

    public UserModel updateUser(UserModel userModel) {

        return userDao.save(userModel);
    }


    public List<UserModel> getAllUser() {
        return (List<UserModel>) userDao.findAll();
    }


    public UserModel getUser(Long id) {
        return userDao.getOne(id);
    }


    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }

    public UserModel findById(Long id){
        return userDao.getOne(id);
    }

    public List<UserModel> findAllUsers(){
        return userDao.findAll();
    }

    public Long numberOfUsers(){
        return userDao.count();
    }
}
