package org.carrot84.java;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubstringTest {
	@Test
	void testSubstring() {
		assertThat(Substring.substring("Helloworld", 3, 7)).isEqualTo("lowo");
		assertThat(Substring.substring("hello", 9, 9)).isEqualTo("hello");
		assertThat(Substring.substring("hello", 3, 1)).isEqualTo("hello");
	}

}