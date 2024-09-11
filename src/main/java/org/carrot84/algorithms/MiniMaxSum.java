package org.carrot84.algorithms;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MiniMaxSum {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());

		Result.miniMaxSum(arr);

		bufferedReader.close();
	}

	static class Result {
		public static void miniMaxSum(List<Integer> arr) {
			AtomicReference<Long> min = new AtomicReference<>(0L);
			AtomicReference<Long> max = new AtomicReference<>(0L);

			Collections.sort(arr);
			IntStream.range(0, 4)
				.forEach(i -> {
					min.accumulateAndGet(Long.valueOf(arr.get(i)), Long::sum);
					max.accumulateAndGet(Long.valueOf(arr.get(arr.size() -1 - i)), Long::sum);
				});

			System.out.printf("%d %d%n", min.get(), max.get());
		}
	}
}
