package com.neosoft.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.constants.CustomerErrorConstant;
import com.neosoft.exception.CustomerServiceGenericException;
import com.neosoft.model.RegisterUser;
import com.neosoft.repository.RegisterUserRepository;
import com.neosoft.service.RegisterUserService;


@Service
public class RegisterUserServiceImpl implements RegisterUserService{
	
	@Autowired
	private RegisterUserRepository registerUserRepository;

	@Override
	public RegisterUser findByFirstName(String firstName) {
		return registerUserRepository.findByFirstName(firstName).orElse(null);
	}

	@Override
	public RegisterUser findByPincode(String pincode) {
		return registerUserRepository.findByPincode(pincode).orElse(null);
	}
	
	public RegisterUser saveUser(RegisterUser registerUser) {
		System.out.println("sucessfully"+registerUser);
		return registerUserRepository.save(registerUser);
	}

	public List<RegisterUser> getUsers(){
		return registerUserRepository.findAll();
	}
	
	public String updateUsers(RegisterUser registerUser, String userId)
	{
		Optional<RegisterUser> users = registerUserRepository.findById(userId);

		if(users.isPresent()) { 
			RegisterUser userEntity = users.get();
			userEntity.setEmailId(registerUser.getEmailId());
			userEntity.setFirstName(registerUser.getFirstName());
			userEntity.setLastName(registerUser.getLastName());	
			userEntity.setDepartment(registerUser.getDepartment());
			userEntity.setDob(registerUser.getDob());
			userEntity.setJoinDate(registerUser.getJoinDate());
			userEntity.setPincode(registerUser.getPincode());
			userEntity.setAddress(registerUser.getAddress());
			userEntity = registerUserRepository.save(userEntity);
			
			return new CustomerServiceGenericException(CustomerErrorConstant.USER_UPDATED_SUCCESSFULLY)+ userId; 
		}
		else {
			return new CustomerServiceGenericException(CustomerErrorConstant.USER_NOT_FOUND)+ userId;
		}	

	}
	public String deleteUser(String userId) {
		return "users deleted !!"+userId;
	}

	public String deleteUsers(String userId) {
		Optional<RegisterUser> optionalUser=registerUserRepository.findById(userId);
		if(optionalUser.isPresent()) {
			registerUserRepository.delete(optionalUser.get());
			return new CustomerServiceGenericException(CustomerErrorConstant.USER_DELETED_SUCCESSFULLY)+ userId; 
		}
		else {
			return new CustomerServiceGenericException(CustomerErrorConstant.USER_NOT_FOUND)+ userId;
		}
		
	}
	
}