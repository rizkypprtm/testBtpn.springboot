package com.testBtpn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MahasiswaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MahasiswaApplication.class, args);
	}
}
