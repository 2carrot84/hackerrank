package org.carrot84;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			//Write your code
			System.out.println(isValid(pattern) ? "Valid" : "Invalid");
			testCases--;
		}
	}

	public static boolean isValid(String s) {
		try {
			Pattern.compile(s);
			return true;
		} catch (PatternSyntaxException e) {
			return false;
		}
	}
}
