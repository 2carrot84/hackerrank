package org.carrot84.algorithms;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.carrot84.tutorials.ClassVsInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class BirthdayCakeCandlesTest {
	@ParameterizedTest
	@MethodSource("provideArguments")
	void birthdayCakeCandlesTest(List<Integer> candles, int expected) {
		assertThat(BirthdayCakeCandles.Result.birthdayCakeCandles(candles)).isEqualTo(expected);
	}

	@ParameterizedTest
	@MethodSource("provideArguments")
	void birthdayCakeCandlesSimpleVerTest(List<Integer> candles, int expected) {
		assertThat(BirthdayCakeCandles.Result.birthdayCakeCandlesSimpleVer(candles)).isEqualTo(expected);
	}

	private static Stream<Arguments> provideArguments() {
		return Stream.of(
			Arguments.of(Arrays.asList(4, 4, 1, 3), 2),
			Arguments.of(Arrays.asList(4, 4, 4, 4), 4),
			Arguments.of(Arrays.asList(3, 2, 1, 3), 2)
		);
	}
}