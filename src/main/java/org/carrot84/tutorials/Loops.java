package org.carrot84.tutorials;

import java.io.*;
import java.util.stream.IntStream;

public class Loops {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(1, 11)
				.forEach(v -> System.out.printf("%d x %d = %d%n", n, v, (n * v)));

		bufferedReader.close();
	}
}
