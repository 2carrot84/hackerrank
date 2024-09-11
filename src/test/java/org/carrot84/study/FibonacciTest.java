package org.carrot84.study;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FibonacciTest {

	@ParameterizedTest
	@MethodSource("providerArguments")
	void fibonacciRecursionTest(int n, int expected) {
		assertThat(Fibonacci.fibonacciRecursion(n)).isEqualTo(expected);
	}

	@ParameterizedTest
	@MethodSource("providerArguments")
	void fibonacciRecursionDpTest(int n, int expected) {
		assertThat(Fibonacci.fibonacciRecursionDp(n)).isEqualTo(expected);
	}

	@ParameterizedTest
	@MethodSource("providerArguments")
	void fibonacciDpTest(int n, int expected) {
		assertThat(Fibonacci.fibonacciDp(n)).isEqualTo(expected);
	}

	private static Stream<Arguments> providerArguments() {
		return Stream.of(
			Arguments.of(0, 0),
			Arguments.of(1, 1),
			Arguments.of(2, 1),
			Arguments.of(3, 2),
			Arguments.of(9, 34),
			Arguments.of(40, 102334155)
		);
	}
}