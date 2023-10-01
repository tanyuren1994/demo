package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

@Slf4j
@SpringBootApplication
public class CollectionMain {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApp1.class, args);
		Scanner scanner = new Scanner(System.in);

		Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
		Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));

		Collection<String> nonBlockedPhones = CollectionUtils.filterPhones(
				new ArrayList<>(phones), new ArrayList<>(blockList));

		System.out.println(nonBlockedPhones.stream()
				.map(Object::toString)
				.collect(Collectors.joining(" ")));

	}
}

class CollectionUtils {

	public static Collection<String> filterPhones(Collection<String> phones,
												  Collection<String> blacklist) {
		// write your code here
//		phones = phones.stream().filter(phone -> blacklist.stream().noneMatch(blacklistItem -> blacklistItem.equals(phone))).collect(Collectors.toList());
		phones = phones.stream().filter(blacklist::contains).collect(Collectors.toList());

		return phones;
	}
}
