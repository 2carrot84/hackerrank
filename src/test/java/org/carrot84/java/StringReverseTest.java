package org.carrot84.java;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringReverseTest {

	@Test
	void testReverse() {
		assertThat(StringReverse.isPalindrome("madam")).isTrue();
		assertThat(StringReverse.isPalindrome("abcd")).isFalse();
	}
}