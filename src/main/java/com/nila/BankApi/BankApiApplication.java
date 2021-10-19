package com.nila.BankApi;

import com.nila.BankApi.model.Login;
import com.nila.BankApi.model.Role;
import com.nila.BankApi.service.BankingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class BankApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApiApplication.class, args);
	}
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
//	@Bean
//	CommandLineRunner run(BankingService userService) {
//		return args -> {
////			userService.saveRole(new Role(null, "ROLE_USER"));
////			userService.saveRole(new Role(null, "ROLE_MANAGER"));
////			userService.saveRole(new Role(null, "ROLE_ADMIN"));
////			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
////
////			userService.saveUser(new Login(null, "john@mail.com", "1234", new ArrayList<>()));
////			userService.saveUser(new Login(null, "will@mail.com","1234", new ArrayList<>()));
////			userService.saveUser(new Login(null, "jim@mail.com",  "1234", new ArrayList<>()));
////			userService.saveUser(new Login(null, "arnold@mail.com",  "1234", new ArrayList<>()));
////
////
////			userService.addRoleToUser("john@mail.com", "ROLE_USER");
////			userService.addRoleToUser("will@mail.com", "ROLE_MANAGER");
////			userService.addRoleToUser("jim@mail.com", "ROLE_ADMIN");
////			userService.addRoleToUser("arnold@mail.com", "ROLE_SUPER_ADMIN");
////			userService.addRoleToUser("arnold@mail.com", "ROLE_ADMIN");
////			userService.addRoleToUser("arnold@mail.com", "ROLE_USER");
//		};
//	}
}
