package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApp1 {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApp1.class, args);

		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("You can't divide by Zero");
		}

		RuntimeException e = new Exception();

	}

}
