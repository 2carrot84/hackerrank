package org.carrot84.algorithms;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CompareTheTriplets {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		List<Integer> result = Result.compareTriplets(a, b);

		bufferedWriter.write(
			result.stream()
				.map(Object::toString)
				.collect(joining(" "))
				+ "\n"
		);

		bufferedReader.close();
		bufferedWriter.close();
	}

	static class Result {
		public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
			List<Integer> result = Arrays.asList(0, 0);

			if (a.size() != b.size()) {
				throw new IllegalArgumentException();
			}

			IntStream.range(0, a.size())
				.forEach(index -> {
					int compared = a.get(index).compareTo(b.get(index));
					if (compared < 0) {
						result.set(1, result.get(1) + 1);
					} else if (compared > 0) {
						result.set(0, result.get(0) + 1);
					}
				});

			return result;
		}
	}
}

