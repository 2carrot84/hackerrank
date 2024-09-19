package org.carrot84.tutorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		// convert binary
		String binaryNumber = convertBinary(n);
		// 0 split, get max length
		System.out.println(splitAndGetMaxLength(binaryNumber));
		bufferedReader.close();
	}

	public static int splitAndGetMaxLength(String binaryNumber) {
		String[] split = binaryNumber.split("0");
		int max = 0;

		for (String str : split) {
			if (max < str.length()) {
				max = str.length();
			}
		}
		return max;
	}

	public static String convertBinary(int n) {
		return Integer.toBinaryString(n);
	}
}
