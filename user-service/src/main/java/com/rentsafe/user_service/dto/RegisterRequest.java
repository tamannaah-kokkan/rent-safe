package com.rentsafe.user_service.dto;

import com.rentsafe.user_service.enums.Role;

import lombok.Data;

@Data
public class RegisterRequest {
	
	private String email;
	private String password;
	private Role role;
	
}
