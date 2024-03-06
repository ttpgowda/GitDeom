package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRestApplication.class, args);
		
		System.out.println(add(10,20));
	}
	
	static int  add(int a, int b) {
		return a+b;
	}

}
