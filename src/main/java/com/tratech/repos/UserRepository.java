package com.tratech.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tratech.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);

}
