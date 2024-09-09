package org.carrot84.java;

import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();

		System.out.println(substring(S, start, end));
	}

	public static String substring(String str, int start, int end) {
		if (str.length() < start || str.length() < end ) {
			return str;
		}

		if (start >= end) {
			return str;
		}

		return str.substring(start, end);
	}
}
