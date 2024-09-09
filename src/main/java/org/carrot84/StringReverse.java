package org.carrot84;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(isPalindrome(A) ? "Yes" : "No");
	}

	public static boolean isPalindrome(String input) {
		return input.contentEquals(new StringBuilder(input).reverse());
	}
}
