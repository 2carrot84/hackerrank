package org.carrot84.algorithms;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class AVeryBigSumTest {
	@Test
	void aVeryBigSumTest() {
		assertThat(AVeryBigSum.Result.aVeryBigSum(Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L))).isEqualTo(5000000015L);
	}

}