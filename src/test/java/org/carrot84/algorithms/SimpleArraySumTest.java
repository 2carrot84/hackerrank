package org.carrot84.algorithms;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SimpleArraySumTest {
	@Test
	void test() {
		assertThat(SimpleArraySum.Result.simpleArraySum(Arrays.asList(1, 2, 3, 4, 10, 11))).isEqualTo(31);
	}
}