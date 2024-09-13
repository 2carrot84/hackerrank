package org.carrot84.study;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PermutationTest {

	@ParameterizedTest
	@MethodSource("provideArguments")
	void permutation(int n, int r) {
		Permutation permutation = new Permutation(n, r);
		permutation.permutation(0, n, r);
	}

	private static Stream<Arguments> provideArguments() {
		return Stream.of(
			Arguments.of(4, 3),
			Arguments.of(3, 2)
		);
	}
}