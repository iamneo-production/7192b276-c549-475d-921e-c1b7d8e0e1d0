package com.examly.springapp.dao;

import com.examly.springapp.entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<UserModel , Long> {


    UserModel findByEmail(String id);
    List<UserModel>  findAll();


}
