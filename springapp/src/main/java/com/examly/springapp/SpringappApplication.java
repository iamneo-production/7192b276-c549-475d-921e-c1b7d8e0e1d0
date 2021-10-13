package com.examly.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import model.*;
import controller.*;
import repo.*;
import service.*;


@SpringBootApplication

@ComponentScan({"com.examly.springapp.controller" , "com.examly.springapp.service"})
@EntityScan({"com.examly.springapp.model"})
@EnableJpaRepositories({"com.examly.springapp.repo"})


public class SpringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
	}

}
