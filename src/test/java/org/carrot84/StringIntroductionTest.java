package org.carrot84;

import static org.assertj.core.api.Assertions.*;

import org.carrot84.java.StringIntroduction;
import org.junit.jupiter.api.Test;

class StringIntroductionTest {

	@Test
	void test() {
		assertThat(StringIntroduction.sumStringLength("hello", "java")).isEqualTo(9);
		assertThat(StringIntroduction.sumStringLength("a", "b")).isEqualTo(2);
	}

	@Test
	void test2() {
		assertThat(StringIntroduction.isLexicographicallyLargerThan("hello", "java")).isEqualTo("No");
		assertThat(StringIntroduction.isLexicographicallyLargerThan("b", "a")).isNotEqualTo("No");
	}

	@Test
	void test3() {
		assertThat(StringIntroduction.printBothWithWhiteSpace("hello", "java")).isEqualTo("Hello Java");
	}
}