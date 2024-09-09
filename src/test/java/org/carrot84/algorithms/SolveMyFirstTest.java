package org.carrot84.algorithms;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SolveMyFirstTest {
	@Test
	void test() {
		assertThat(SolveMyFirst.solveMeFirst(2, 3)).isEqualTo(5);
		assertThatThrownBy(() -> {
				SolveMyFirst.solveMeFirst(-1, 3);
				SolveMyFirst.solveMeFirst(1, 10000);
			}
		).isInstanceOf(IllegalArgumentException.class);
	}

	@ParameterizedTest
	@ValueSource(ints = {-1, 0, 1001})
	void isNotValidTest(int a) {
		assertThat(SolveMyFirst.isValid(a)).isFalse();
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 1000, 500, 2, 3})
	void isValidTest(int a) {
		assertThat(SolveMyFirst.isValid(a)).isTrue();
	}
}