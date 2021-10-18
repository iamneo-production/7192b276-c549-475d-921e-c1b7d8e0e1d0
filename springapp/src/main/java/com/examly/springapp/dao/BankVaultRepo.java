package com.examly.springapp.dao;

import com.examly.springapp.entity.BankVaultModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankVaultRepo extends JpaRepository<BankVaultModel, Long> {
}
