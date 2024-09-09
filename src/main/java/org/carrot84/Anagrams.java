package org.carrot84;

import java.util.Scanner;

public class Anagrams {
	static boolean isAnagram(String a, String b) {
		// Complete the function
		return makeAnagram(a).equals(makeAnagram(b));
	}

	private static java.util.HashMap<Character, Integer> makeAnagram(String a) {
		java.util.HashMap<Character, Integer> map = new java.util.HashMap<>();
		a.toLowerCase().chars()
			.forEach(c -> map.put((char)c, map.getOrDefault((char)c, 0) + 1));
		return map;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}
