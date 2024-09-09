package org.carrot84;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class Loops2 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			print(a, b, n);
		}
		in.close();
	}

	public static void print(int a, int b, int n) {
		IntStream.range(1, n + 1)
			.forEach(s -> System.out.printf("%d ", a + (int)sum(b, s)));
		System.out.println();
	}

	public static double sum(int b, int n) {
		AtomicReference<Double> result = new AtomicReference<>(0.0);
		IntStream.range(0, n)
			.forEach(i -> result.updateAndGet(v -> v + b * Math.pow(2, i)));
		return result.get();
	}
}
