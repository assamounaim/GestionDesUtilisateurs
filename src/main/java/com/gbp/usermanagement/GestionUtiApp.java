package com.gbp.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.gbp.usermanagement"})
public class GestionUtiApp {

	public static void main(String[] args) {
		SpringApplication.run(GestionUtiApp.class, args);
	}

}
