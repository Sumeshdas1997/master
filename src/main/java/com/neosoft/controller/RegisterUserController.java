package com.neosoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.model.RegisterUser;
import com.neosoft.serviceImpl.RegisterUserServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class RegisterUserController {
	
	@Autowired
	private RegisterUserServiceImpl serviceImpl;

	@PostMapping("/addusers")
	public RegisterUser addUsers( @RequestBody RegisterUser regUsers) {
		
		RegisterUser registerUser=serviceImpl.saveUser(regUsers);
		return registerUser;
		
	}

	@GetMapping("/users")
	public List<RegisterUser> findAllUsers(){
		return serviceImpl.getUsers();
	}

	
	@GetMapping("/users/{firstName}")
	public RegisterUser findUsersByName(@PathVariable String firstName) {
		return serviceImpl.findByFirstName(firstName);
	}

	@GetMapping("/user/{pincode}")
	public RegisterUser findUsersByPincode(@PathVariable String pincode) {
		return serviceImpl.findByPincode(pincode);
	}


	@PutMapping("/users/{userId}")
	public String updateUsers( @RequestBody RegisterUser regUsers, @PathVariable String userId) 
	{
		return serviceImpl.updateUsers(regUsers, userId);

	}

	@DeleteMapping("/users/{userId}")
	public String deleteUsers(@PathVariable String userId) {
		return serviceImpl.deleteUser(userId);
	}

	@DeleteMapping("/user/{userId}")
	public String deleteUser(@PathVariable String userId) {
		return serviceImpl.deleteUser(userId);
	}

}