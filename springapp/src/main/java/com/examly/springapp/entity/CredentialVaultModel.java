package com.examly.springapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "credential_vault")
public class CredentialVaultModel {

    @Id
    @Column(name = "vault_id")
    private String vaultId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private UserModel user;

    @Column(name = "source_name")
    private String sourceName;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public CredentialVaultModel() {
    }


    public CredentialVaultModel(String vaultId,  UserModel user, String sourceName, String username, String password) {
        this.vaultId = vaultId;
        this.user = user;
        this.sourceName = sourceName;
        this.username = username;
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

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}