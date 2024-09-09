package org.carrot84;

import java.util.Scanner;

public class StdInStdOut1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max_size = 3;
		int current_size = 0;

		while (scan.hasNextInt()) {
			int a = scan.nextInt();
			System.out.println(a);
			current_size++;
			if (current_size >= max_size) {
				break;
			}
		}

		scan.close();
	}
}
