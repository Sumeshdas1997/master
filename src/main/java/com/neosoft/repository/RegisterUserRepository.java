package com.neosoft.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.model.RegisterUser;


@Repository
public interface RegisterUserRepository extends JpaRepository<RegisterUser, String>{
	
	
	Optional<RegisterUser> findByFirstName(String firstName);
	
	Optional<RegisterUser> findByPincode(String pincode);
}
