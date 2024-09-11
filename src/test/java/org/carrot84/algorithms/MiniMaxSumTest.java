package org.carrot84.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MiniMaxSumTest {

	@ParameterizedTest
	@MethodSource("provideArguments")
	void miniMaxSumTest(List<Integer> arr) {
		MiniMaxSum.Result.miniMaxSum(arr);
	}

	private static Stream<Arguments> provideArguments() {
		return Stream.of(
			Arguments.of(Arrays.asList(1, 3, 5, 7, 9)),
			Arguments.of(Arrays.asList(7, 69, 2, 221, 8974)),
			Arguments.of(Arrays.asList(1, 2, 3, 4, 5))
		);
	}
}