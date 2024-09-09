package org.carrot84;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		tokenizer(s);
		scan.close();
	}

	public static void tokenizer(String s) {
		String[] split = s.split("[ !,?._'@]+");
		List<String> result = Arrays.stream(split)
			.filter(str -> !str.isEmpty())
			.collect(Collectors.toList());

		System.out.println(result.size());
		result.forEach(System.out::println);
	}
}
