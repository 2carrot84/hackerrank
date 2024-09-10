package org.carrot84.algorithms;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;

public class PlusMinus {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		Result.plusMinus(arr);

		bufferedReader.close();
	}

	static class Result {
		public static void plusMinus(List<Integer> arr) {
			System.out.printf("%.6f%n", arr.stream().filter(i -> i > 0).count() / (float)arr.size());
			System.out.printf("%.6f%n", arr.stream().filter(i -> i < 0).count() / (float)arr.size());
			System.out.printf("%.6f%n", arr.stream().filter(i -> i == 0).count() / (float)arr.size());
		}
	}
}
