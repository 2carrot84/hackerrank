package org.carrot84.java;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class JavaRegexTest {
	@ParameterizedTest
	@ValueSource(strings = {"000.12.12.034",
		"121.234.12.12",
		"255.255.255.255",
		"91.255.255.255",
		"1.255.255.255",
		"191.255.255.255",
		"23.45.12.56"})
	void parameterizedTestIsTrue(String pattern) {
		assertThat(pattern.matches(new MyRegex().pattern)).isTrue();
	}

	@ParameterizedTest
	@ValueSource(strings = {
		"122.23",
		"Hello.IP",
		"000.12.234.23.23",
		"666.666.23.23",
		".213.123.23.32",
		"23.45.22.32.",
		"I.Am.not.an.ip"})
	void parameterizedTestIsFalse(String pattern) {
		assertThat(pattern.matches(new MyRegex().pattern)).isFalse();
	}
}