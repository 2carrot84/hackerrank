package org.carrot84.algorithms;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DiagonalDifference {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			try {
				arr.add(
					Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt)
						.collect(toList())
				);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = Result.diagonalDifference(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

	static class Result {
		public static int diagonalDifference(List<List<Integer>> arr) {
			// Write your code here
			AtomicInteger primaryDiagonal = new AtomicInteger(0);
			AtomicInteger secondaryDiagonal = new AtomicInteger(0);

			IntStream.range(0, arr.size())
				.forEach(i -> {
					primaryDiagonal.addAndGet(arr.get(i).get(i));
					secondaryDiagonal.addAndGet(arr.get(i).get(arr.size() - 1 - i));
				});

			return Math.abs(primaryDiagonal.get() - secondaryDiagonal.get());
		}
	}
}
