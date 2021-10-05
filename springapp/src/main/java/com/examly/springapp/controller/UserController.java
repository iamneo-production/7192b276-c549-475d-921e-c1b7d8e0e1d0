// package main.java.controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;



// @Controller
// public class HomeController {


//     @RequestMapping("/home")
//     @ResponseBody
//     public String home()
//     {
//         return "hello world";
//     }
    
 
// }


package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.UserModel;
import repo.UserRepo;

@RestController
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	@GetMapping("/")
	public String Home() {
		return "Rest Server Started ";
	}
	
	@GetMapping("/allUsers")
	public List<UserModel> allUsers(){
		return userRepo.findAll();
	}

	@PostMapping("/allUsers")
	public UserModel addUsers(@RequestBody UserModel users) {
		return userRepo.save(users);
	}
	
	@GetMapping("/user/{id}")
	public Optional<UserModel> getUser(@PathVariable String id) {
		return userRepo.findById(id);
	}
	
	//Update
	
	//Detele
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable String id){
		userRepo.deleteById(id);
		return "Success";
	}
}