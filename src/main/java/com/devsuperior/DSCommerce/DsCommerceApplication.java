package com.devsuperior.DSCommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DsCommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsCommerceApplication.class, args);
	}
}
