package org.carrot84.study;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TargetNumberTest {

	@ParameterizedTest
	@MethodSource("provideArguments")
	void solution(int[] numbers, int target, int expected) {
		assertThat(TargetNumber.solution(numbers, target)).isEqualTo(expected);
	}

	private static Stream<Arguments> provideArguments() {
		return Stream.of(
			Arguments.of(new int[] {1, 1, 1, 1, 1}, 3, 5),
			Arguments.of(new int[] {4, 1, 2, 1}, 4, 2)
		);
	}
}