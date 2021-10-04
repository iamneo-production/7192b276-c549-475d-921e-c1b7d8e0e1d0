package main.java.com.examly.springapp.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {
  

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "mobileNumber")
    private String mobileNumber;

    private boolean activate  = true;
    @Column(name = "role")
    private String role;   
  
  public UserModel(){
  
  }
  
  public String getEmail() {
      return email;
  }
  public String getMobileNumber() {
      return mobileNumber;
  }
  public String getPassword() {
      return password;
  }
  public String getRole() {
      return role;
  }
  public boolean isActivate() {
      return activate;
  }
  
  
  
  
  public void setActivate(boolean activate) {
      this.activate = activate;
  }
  public void setEmail(String email) {
      this.email = email;
  }
  public void setMobileNumber(String mobileNumber) {
      this.mobileNumber = mobileNumber;
  }
  public void setPassword(String password) {
      this.password = password;
  }
  public void setRole(String role) {
      this.role = role;
  }



  }
   