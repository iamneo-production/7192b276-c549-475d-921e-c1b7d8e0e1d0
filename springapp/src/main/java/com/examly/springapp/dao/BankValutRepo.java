package com.examly.springapp.dao;

import com.examly.springapp.entity.BankValutModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankValutRepo extends JpaRepository<BankValutModel, Long> {
}