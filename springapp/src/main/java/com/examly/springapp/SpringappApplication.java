// // package com.examly.springapp;

// // import org.springframework.boot.SpringApplication;
// // import org.springframework.boot.autoconfigure.SpringBootApplication;

// // import org.springframework.boot.autoconfigure.SpringBootApplication;
// // import org.springframework.boot.autoconfigure.domain.EntityScan;
// // import org.springframework.context.annotation.ComponentScan;
// // import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


// // import model.*;
// // import controller.*;
// // import repo.*;
// // import service.*;


// // @SpringBootApplication

// // // @ComponentScan( basePackageClasses = {SignupController.class, BankValutController.class, BankService.class, UserService.class})
// // // @EntityScan( basePackageClasses = {UserModel.class, BankValutModel.class})
// // // @EnableJpaRepositories( basePackageClasses = {BankRepo.class, UserRepo.class})

// // @ComponentScan( basePackages = {"com.examly.springapp.controller" , "com.examly.springapp.service"})
// // @EntityScan( basePackages = {"com.examly.springapp.model"})
// // @EnableJpaRepositories( basePackages = {"com.examly.springapp.repo"})

// // public class SpringappApplication {

// // 	public static void main(String[] args) {
// // 		SpringApplication.run(SpringappApplication.class, args);
// // 	}




package com.examly.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// @ComponentScan(basePackages = {"com.examly.springapp.service","com.examly.springapp.controller"})
// @EnableJpaRepositories(basePackages = {"com.examly.springapp.repository"})

public class SpringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
	}

}
