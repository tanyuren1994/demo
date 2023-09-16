package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Scanner scanner = new Scanner(System.in);
		int arrayLength = scanner.nextInt();
		int[] arr = new int[arrayLength];
		for (int i=0; i<arrayLength; i++) {
			arr[i] = scanner.nextInt();
		}
		int maxNumber = arr[0];
		int index = 0;
		for (int i=1; i<arrayLength; i++) {
			if (arr[i] > maxNumber){
				index = i;
				maxNumber = arr[i];
			}
		}
		System.out.println(index);


	}

}
