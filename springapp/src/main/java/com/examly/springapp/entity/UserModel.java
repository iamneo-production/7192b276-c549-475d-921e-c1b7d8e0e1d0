package com.examly.springapp.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;



@Setter
@Getter
@Entity
@Table(name = "user", schema = "test")

public class UserModel {



    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @SequenceGenerator(name = "user_id_generator", sequenceName = "id", initialValue = 100)
    @Column(name = "user_id", length = 11)
    private Long userId;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "username")
    private String username;

    @Column(name = "active")
    private Boolean active = true;

    @Column(name = "role")
    private String role;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<MediaValutModel> mediaList;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<BankValutModel> bankList;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<CredentialValutModel> credentialList;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",
            joinColumns = {
                    @JoinColumn(name = "USER_ID")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ROLE_ID")
            }
    )
    private Set<Role> role_Role;



    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getRole() {
        return role;
    }



}
