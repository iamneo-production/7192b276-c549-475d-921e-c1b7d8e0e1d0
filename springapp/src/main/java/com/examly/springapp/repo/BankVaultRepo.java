package com.examly.springapp.repo;

import com.examly.springapp.model.BankVaultModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankVaultRepo extends JpaRepository<BankVaultModel, Long> {
}
