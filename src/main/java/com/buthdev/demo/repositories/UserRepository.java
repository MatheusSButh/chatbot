package com.buthdev.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.buthdev.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	UserDetails findByEmail(String email);
	
	User findUserByEmail(String email);
}