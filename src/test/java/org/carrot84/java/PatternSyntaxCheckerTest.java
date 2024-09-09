package org.carrot84.java;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PatternSyntaxCheckerTest {

	@Test
	void test() {
		assertThat(PatternSyntaxChecker.isValid("([A-Z])(.+)")).isTrue();
		assertThat(PatternSyntaxChecker.isValid("[AZ[a-z](a-z)")).isFalse();
		assertThat(PatternSyntaxChecker.isValid("batcatpat(nat")).isFalse();

	}
}