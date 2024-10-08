package org.carrot84.algorithms;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class AVeryBigSum {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Long::parseLong)
			.collect(toList());

		long result = Result.aVeryBigSum(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

	static class Result {
		/*
		 * Complete the 'aVeryBigSum' function below.
		 *
		 * The function is expected to return a LONG_INTEGER.
		 * The function accepts LONG_INTEGER_ARRAY ar as parameter.
		 */

		public static long aVeryBigSum(List<Long> ar) {
			// Write your code here
			// return ar.stream().reduce(Long::sum).orElse(0L);
			return ar.stream().mapToLong(Long::longValue).sum();
		}
	}
}
