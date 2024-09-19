package org.carrot84.tutorials;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Arrays {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		System.out.println(solution(arr));

		bufferedReader.close();
	}

	public static String solution(List<Integer> arr) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr.size() ; i++) {
			sb.append(arr.get(arr.size() - i -1));
			sb.append(" ");
		}

		return sb.toString();
	}
}
