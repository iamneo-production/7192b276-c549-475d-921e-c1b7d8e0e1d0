package com.examly.springapp.model;


import javax.persistence.*;

@Entity
@Table(name = "bank_vault")
public class BankVaultModel {

    @Id
    @Column(name = "vault_id")
    private String vaultId;
    @Column(name = "account_number")
    private long accountNumber;
    @Column(name = "account_name")
    private String accountName;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "ifsc")
    private String ifsc;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private UserModel user;


    public BankVaultModel() {
    }


    public BankVaultModel(String vaultId, long accountNumber, String accountName, String username, String password, String ifsc, UserModel user) {
        this.vaultId = vaultId;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.username = username;
        this.password = password;
        this.ifsc = ifsc;
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }
}
