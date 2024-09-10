package org.carrot84.algorithms;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class DiagonalDifferenceTest {
	@Test
	void diagonalDifferenceTest() {
		assertThat(DiagonalDifference.Result.diagonalDifference(Arrays.asList(
			Arrays.asList(1, 2, 3),
			Arrays.asList(4, 5, 6),
			Arrays.asList(9, 8, 9)))).isEqualTo(2);
		assertThat(DiagonalDifference.Result.diagonalDifference(Arrays.asList(
			Arrays.asList(11, 2, 4),
			Arrays.asList(4, 5, 6),
			Arrays.asList(10, 8, -12)))).isEqualTo(15);
	}
}