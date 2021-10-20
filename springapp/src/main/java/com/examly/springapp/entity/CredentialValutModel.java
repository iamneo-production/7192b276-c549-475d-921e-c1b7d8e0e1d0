package com.examly.springapp.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "credentials", schema = "test")

public class CredentialValutModel {

    @Id
    @Column(name = "id", length = 11)
    private Integer id;

    @Column(name = "valutId")
    private String valutId;

    @Column(name = "sourcename")
    private String sourceName;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user", referencedColumnName = "user_id")
    private UserModel user;


//    public CredentialValutModel() {
//    }
//
//
//    public CredentialValutModel(String valutId, UserModel user, String sourceName, String username, String password) {
//        this.valutId = valutId;
//        this.user = user;
//        this.sourceName = sourceName;
//        this.username = username;
//        this.password = password;
//    }

//    public String getValutId() {
//        return valutId;
//    }
//
//    public void setValutId(String vaultId) {
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
//    public String getSourceName() {
//        return sourceName;
//    }
//
//    public void setSourceName(String sourceName) {
//        this.sourceName = sourceName;
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
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}