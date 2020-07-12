package com.example.dogAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DogApiApplication {

	public static void main(String[] args) {

		System.out.println("Hello world");

		SpringApplication.run(DogApiApplication.class, args);
	}

}
