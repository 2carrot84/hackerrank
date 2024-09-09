package org.carrot84.algorithms;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ResultTest {

	@Test
	void compareTripletsTest() {
		assertThat(CompareTheTriplets.Result.compareTriplets(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1))).isEqualTo(
			Arrays.asList(1, 1));
		assertThat(
			CompareTheTriplets.Result.compareTriplets(Arrays.asList(17, 28, 30), Arrays.asList(99, 16, 8))).isEqualTo(
			Arrays.asList(2, 1));
	}
}