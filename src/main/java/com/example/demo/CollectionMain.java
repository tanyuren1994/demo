package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@SpringBootApplication
//public class CollectionMain {
//
//	public static void main(String[] args) {
////		SpringApplication.run(DemoApp1.class, args);
//		Scanner scanner = new Scanner(System.in);
//
//		Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
//		Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));
//
//		Collection<String> nonBlockedPhones = CollectionUtils.filterPhones(
//				new ArrayList<>(phones), new ArrayList<>(blockList));
//
//		System.out.println(nonBlockedPhones.stream()
//				.map(Object::toString)
//				.collect(Collectors.joining(" ")));
//
//	}
//}

class CollectionUtils {

	public static Collection<String> filterPhones(Collection<String> phones,
												  Collection<String> blacklist) {
		// write your code here
//		phones = phones.stream().filter(phone -> blacklist.stream().noneMatch(blacklistItem -> blacklistItem.equals(phone))).collect(Collectors.toList());
		phones = phones.stream().filter(blacklist::contains).collect(Collectors.toList());

		return phones;
	}
}

public class CollectionMain {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
		for (String name : nameList) {
			System.out.println(name);
		}

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(7);
		System.out.println(list);

		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		numbers.add(6);
		System.out.println(numbers);
	}
}
