package org.carrot84;

import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int line = 1;

		while (sc.hasNextLine()) {
			System.out.printf("%d %s%n", line++, sc.nextLine());
		}

		sc.close();
	}
}
