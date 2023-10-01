package com.example.demo;

import com.example.demo.testclass.Holder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DemoApp1 {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApp1.class, args);

		// initialize an instance of Holder to make the code below compiled
		Holder<String> holder = new Holder();

		// do not change the code below
		holder.set("This is an instance of String");

		String value = holder.get();
		System.out.println(value);

	}

}
