package com.spring.jkn.security.service;

import com.spring.jkn.model.User;
import com.spring.jkn.security.dto.AuthenticatedUserDto;
import com.spring.jkn.security.dto.RegistrationRequest;
import com.spring.jkn.security.dto.RegistrationResponse;

public interface UserService {

	User findByUsername(String username);

	RegistrationResponse registration(RegistrationRequest registrationRequest);

	AuthenticatedUserDto findAuthenticatedUserByUsername(String username);

}
