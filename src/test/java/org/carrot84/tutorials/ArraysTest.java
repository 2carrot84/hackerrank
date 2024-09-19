package org.carrot84.tutorials;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraysTest {

	@Test
	void solution() {
		assertThat(Arrays.solution(java.util.Arrays.asList(1, 4, 3, 2))).isEqualTo("2 3 4 1 ");
	}
}