package org.carrot84.algorithms;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ThePowerSumTest {

	@ParameterizedTest
	@MethodSource("provideArguments")
	void powerSumTest(int x, int y, int expected) {
		assertThat(ThePowerSum.Result.powerSum(x, y)).isEqualTo(expected);
	}

	private static Stream<Arguments> provideArguments() {
		return Stream.of(
			Arguments.of(13, 2, 1)/*,
			Arguments.of(10, 2, 1),
			Arguments.of(100, 2, 3),
			Arguments.of(100, 3, 1)*/
		);
	}
}