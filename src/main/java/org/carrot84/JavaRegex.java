package org.carrot84;

import java.util.Scanner;

public class JavaRegex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}

	}
}


class MyRegex {
	private final String zeroTo255 = "((0|1)\\d{2}|2[0-4]\\d|25[0-5]|\\d{1,2})";
	// 1. 0 또는 1 로 시작 하고 2자리 수 숫자
	// 2. 2 로 시작 하고 0-4 와 1자리 수 숫자
	// 3. 25 로 시작하고 0-5 숫자
	// 4. 1 자리나 2 자리 숫자
	public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}
