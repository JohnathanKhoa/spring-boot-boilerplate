package com.spring.jkn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jkn.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

	boolean existsByEmail(String email);

	boolean existsByUsername(String username);

}
