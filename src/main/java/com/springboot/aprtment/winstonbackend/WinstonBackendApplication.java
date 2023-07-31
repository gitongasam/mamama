package com.springboot.aprtment.winstonbackend;

import com.springboot.aprtment.winstonbackend.Service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })

public class  WinstonBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WinstonBackendApplication.class, args);
	}

}
