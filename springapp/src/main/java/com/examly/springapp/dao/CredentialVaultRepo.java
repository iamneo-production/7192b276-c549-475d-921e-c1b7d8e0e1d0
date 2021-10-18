package com.examly.springapp.dao;

import com.examly.springapp.entity.CredentialVaultModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialVaultRepo extends JpaRepository<CredentialVaultModel, String> {
}