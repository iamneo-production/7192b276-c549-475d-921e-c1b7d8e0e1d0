package com.examly.springapp.entity;


import com.examly.springapp.entity.UserModel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "bank", schema = "test")

public class BankValutModel {

    @Id
    @Column(name = "user_id", length = 11)
    private Integer bank_id;

    @Column(name = "valutId")
    private String valutId;

    @Column(name = "accountnumber")
    private long accountNumber;

    @Column(name = "accountName")
    private String accountName;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "ifsc")
    private String ifsc;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user", referencedColumnName = "user_id")
    private UserModel user;


//    public BankValutModel() {
//    }
//
//
//    public BankValutModel(String vaultId, long accountNumber, String accountName, String username, String password, String ifsc, UserModel user) {
//        this.valutId = vaultId;
//        this.accountNumber = accountNumber;
//        this.accountName = accountName;
//        this.username = username;
//        this.password = password;
//        this.ifsc = ifsc;
//        this.user = user;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getVaultId() {
//        return valutId;
//    }
//
//    public void setVaultId(String vaultId) {
//        this.valutId = vaultId;
//    }
//
//    public UserModel getUser() {
//        return user;
//    }
//
//    public void setUser(UserModel user) {
//        this.user = user;
//    }
//
//    public long getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setAccountNumber(long accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public String getAccountName() {
//        return accountName;
//    }
//
//    public void setAccountName(String accountName) {
//        this.accountName = accountName;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getIfsc() {
//        return ifsc;
//    }
//
//    public void setIfsc(String ifsc) {
//        this.ifsc = ifsc;
//    }
}