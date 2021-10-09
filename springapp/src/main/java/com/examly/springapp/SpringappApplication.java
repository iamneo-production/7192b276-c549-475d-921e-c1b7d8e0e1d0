
//https://github.com/naveen-veera/productAPIExample 



package com.examly.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import model.*;
import controller.*;
import repo.*;
import service.*;
@SpringBootApplication
// @ComponentScan( basePackages = { "/controller" , "/service" })
// // @ComponentScan("/controller,/service")
// @EntityScan({"/model"})
// @EnableJpaRepositories({"/repo"})


public class SpringappApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);

	}

}
