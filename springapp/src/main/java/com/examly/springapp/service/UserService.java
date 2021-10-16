package com.examly.springapp.service;

import com.examly.springapp.dao.RoleDao;
import com.examly.springapp.dao.UserDao;
import com.examly.springapp.entity.Role;
import com.examly.springapp.entity.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void initRoleAndUser() {

        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("UserModel");
        userRole.setRoleDescription("Default role for newly created record");
        roleDao.save(userRole);

        UserModel adminUserModel = new UserModel();
        adminUserModel.setEmail("admin");
        adminUserModel.setPassword(getEncodedPassword("admin"));
        adminUserModel.setMobileNumber("123");
//        Set<Role> adminRoles = new HashSet<>();
//        adminRoles.add(adminRole);
        adminUserModel.setRole("Admin");
        userDao.save(adminUserModel);

//
//        UserModel user = new UserModel();
//        user.setEmail("rajat");
//        user.setPassword(getEncodedPassword("rajat"));
//        user.setMobileNumber("123");
////        Set<Role> userRoles = new HashSet<>();
//
//        user.setRole("User");
//        userDao.save(user);
    }

    public UserModel registerNewUser(UserModel userModel) {
        Role role = roleDao.findById("UserModel").get();
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(role);
        userModel.setRole("User");
        userModel.setPassword(getEncodedPassword(userModel.getPassword()));

        return userDao.save(userModel);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
