// package main.java.com.examly.springapp.model;

package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Id;
import java.util.List;

@Entity
@Table(name = "Checking")
public class UserModel {


    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    private String mobileNumber;
    private boolean active = true;
    private String role;


    public UserModel() {

    }


    public UserModel(Long id, String email, String password, String mobileNumber, boolean active, String role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.active = active;
        this.role = role;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}


// package model;

// import javax.persistence.Entity;
// import javax.persistence.Table;
// import javax.persistence.Id;

// @Entity
// @Table(name = "Users")
// public class ProductModel {

// 	@Id
// 	private String productId;
// 	private String productName;
// 	private String productDesc;
// 	private int price;
	
// 	public ProductModel(String productId, String productName, String productDesc, int price) {
// 		super();
// 		this.productId = productId;
// 		this.productName = productName;
// 		this.productDesc = productDesc;
// 		this.price = price;
// 	}
	
// 	public ProductModel() {
// 		super();
// 		// TODO Auto-generated constructor stub
// 	}
	
// 	public String getProductId() {
// 		return productId;
// 	}
// 	public void setProductId(String productId) {
// 		this.productId = productId;
// 	}
// 	public String getProductName() {
// 		return productName;
// 	}
// 	public void setProductName(String productName) {
// 		this.productName = productName;
// 	}
// 	public String getProductDesc() {
// 		return productDesc;
// 	}
// 	public void setProductDesc(String productDesc) {
// 		this.productDesc = productDesc;
// 	}
// 	public int getPrice() {
// 		return price;
// 	}
// 	public void setPrice(int price) {
// 		this.price = price;
// 	}
// }