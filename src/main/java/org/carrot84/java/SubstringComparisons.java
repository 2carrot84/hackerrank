package org.carrot84.java;

import java.util.Scanner;

public class SubstringComparisons {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		// List<String> substringList = new ArrayList<>();
		// IntStream.range(0, s.length() - k + 1)
		// 	.forEach(index -> substringList.add(s.substring(index, index + k)));
		// substringList.sort(String::compareTo);
		// smallest = substringList.get(0);
		// largest = substringList.get(substringList.size() - 1);
		for (int i = 0; i <= s.length() - k; i++) {
			String temp = s.substring(i, i + k);
			if (temp.compareTo(smallest) < 0 || smallest.isEmpty()) {
				smallest = temp;
			}

			if (temp.compareTo(largest) > 0) {
				largest = temp;
			}
		}

		return smallest + "\n" + largest;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
