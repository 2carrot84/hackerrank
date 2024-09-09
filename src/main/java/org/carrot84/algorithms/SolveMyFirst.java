package org.carrot84.algorithms;

import java.util.Scanner;

public class SolveMyFirst {

	static int solveMeFirst(int a, int b) {
		// Hint: Type return a+b; below
		if (!isValid(a) || !isValid(b)) {
			throw new IllegalArgumentException();
		}

		return a + b;
	}

	static boolean isValid(int a) {
		return 1 <= a && a <= 1000;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		int sum;
		sum = solveMeFirst(a, b);
		System.out.println(sum);
	}
}
