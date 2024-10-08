package org.carrot84.java;

import java.util.Scanner;

public class DataTypes {
	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				print(x);
				//Complete the code
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
		}

		sc.close();
	}

	public static void print(long x) {
		if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
			System.out.println("* byte");
		}

		if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
			System.out.println("* short");
		}

		if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
			System.out.println("* int");
		}

		System.out.println("* long");
	}
}
