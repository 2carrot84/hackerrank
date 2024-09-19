package org.carrot84.tutorials;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LetsReview {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		List<String> list = new ArrayList<>();

		IntStream.range(0, T)
			.forEach(i -> list.add(in.nextLine()));

		solution(list);
	}

	static void solution(List<String> list) {
		for (String S : list) {
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < S.length(); i++) {
				if (i % 2 == 0) {
					System.out.printf("%s", S.charAt(i));
				} else {
					sb.append(S.charAt(i));
				}
			}
			System.out.printf(" %s%n", sb);
		}
	}
}
