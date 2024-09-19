package org.carrot84.tutorials;

import java.util.*;
import java.io.*;

public class DictionariesAndMaps {
	public static void main(String []argh){
		Map<String, String> phoneBook = new HashMap<>();

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++){
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			phoneBook.put(name, String.valueOf(phone));
		}
		while(in.hasNext()){
			String s = in.next();
			// Write code here
			if (phoneBook.containsKey(s)) {
				System.out.printf("%s=%s%n", s, phoneBook.get(s));
			} else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
