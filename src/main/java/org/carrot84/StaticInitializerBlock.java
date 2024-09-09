package org.carrot84;

import java.util.Scanner;

public class StaticInitializerBlock {
	static int B;
	static int H;

	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		sc.close();
	}

	public static void main(String[] args) {
		try {
			if (B <= 0 || H <= 0) {
				throw new Exception("Breadth and height must be positive");
			}
			System.out.println(B * H);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
