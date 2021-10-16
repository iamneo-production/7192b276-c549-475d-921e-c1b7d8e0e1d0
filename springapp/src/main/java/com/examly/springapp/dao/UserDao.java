package com.examly.springapp.dao;

import com.examly.springapp.entity.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<UserModel, String> {
}
