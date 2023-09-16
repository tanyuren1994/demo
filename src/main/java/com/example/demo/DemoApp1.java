package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DemoApp1 {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApp1.class, args);

		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			log.info("You can't divide by Zero");
		}
	}

}
