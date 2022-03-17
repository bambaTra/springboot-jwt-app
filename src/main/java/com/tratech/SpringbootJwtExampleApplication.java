package com.tratech;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tratech.entity.User;
import com.tratech.repos.UserRepository;

@SpringBootApplication
public class SpringbootJwtExampleApplication {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
				new User(1L, "Bambiste", "bamba1234", "bambiste@gmail.com"),
				new User(2L, "Mafisko", "mafaye1234", "mafisko@gmail.com"),
				new User(3L, "Dash", "dash1234", "dash@gmail.com")
				).collect(Collectors.toList());
		userRepository.saveAll(users);
				
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJwtExampleApplication.class, args);
	}

}
