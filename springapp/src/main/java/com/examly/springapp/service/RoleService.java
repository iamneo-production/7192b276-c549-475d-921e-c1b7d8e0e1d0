package com.examly.springapp.service;

import com.examly.springapp.dao.RoleDao;
import com.examly.springapp.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

   @Autowired
   private RoleDao roleDao;

   public Role createNewRole(Role role) {
       return roleDao.save(role);
   }
}
