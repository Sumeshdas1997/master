package com.neosoft.service;

import java.util.List;

import com.neosoft.model.RegisterUser;

public interface RegisterUserService {

	public RegisterUser saveUser(RegisterUser registerUser);
	
	RegisterUser findByFirstName(String firstName);
	
	RegisterUser findByPincode(String pincode);
	
	public List<RegisterUser> getUsers();
	
	public String updateUsers(RegisterUser registerUser, String userId);
}
