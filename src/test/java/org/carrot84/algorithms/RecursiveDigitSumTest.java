package org.carrot84.algorithms;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.carrot84.study.Combination;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RecursiveDigitSumTest {
	@ParameterizedTest
	@MethodSource("provideArguments")
	void superDigitTest(String n, int k, int expected) {
		assertThat(RecursiveDigitSum.Result.superDigit(n, k)).isEqualTo(expected);
	}


	private static Stream<Arguments> provideArguments() {
		return Stream.of(
			Arguments.of("148", 3, 3),
			Arguments.of("9875", 4, 8),
			Arguments.of("123", 3, 9),
			Arguments.of("9875", 4, 8)
		);
	}
}