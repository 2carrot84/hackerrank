package org.carrot84.tutorials;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Recursion3Test {
	@Test
	void factorialTest() {
		assertThat(Recursion3.Result.factorial(1)).isEqualTo(1);
		assertThat(Recursion3.Result.factorial(2)).isEqualTo(2);
		assertThat(Recursion3.Result.factorial(3)).isEqualTo(6);
		assertThat(Recursion3.Result.factorial(4)).isEqualTo(24);
	}
}