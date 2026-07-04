package com.rentsafe.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentsafe.user_service.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByEmail(String email);
}
