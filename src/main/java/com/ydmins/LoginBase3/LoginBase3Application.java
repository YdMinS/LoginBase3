package com.ydmins.LoginBase3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class LoginBase3Application {

	public static void main(String[] args) {
		SpringApplication.run(LoginBase3Application.class, args);
	}

}
