package org.carrot84;

import java.util.Scanner;

public class StringIntroduction {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(sumStringLength(A, B));
		System.out.println(isLexicographicallyLargerThan(A, B));
		System.out.println(printBothWithWhiteSpace(A, B));
	}

	public static int sumStringLength(String a, String b) {
		return a.length() + b.length();
	}

	public static String isLexicographicallyLargerThan(String a, String b) {
		if (a.compareTo(b) <= 0) {
			return "No";
		}

		return "Yes";
	}

	public static String printBothWithWhiteSpace(String hello, String java) {
		return capitalize(hello) + " " + capitalize(java);
	}

	private static String capitalize(String hello) {
		return hello.substring(0, 1).toUpperCase() + hello.substring(1);
	}
}
