package com.examly.springapp.dao;

import com.examly.springapp.entity.CredentialValutModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialValutRepo extends JpaRepository<CredentialValutModel, Long> {

    void deleteById(Integer id);
//    CredentialValutModel findById(Integer id);
}