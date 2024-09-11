package org.carrot84.study;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import java.util.stream.Stream;

import org.assertj.core.util.Strings;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

public class ParameterizedTests {
	@ParameterizedTest(name = "{index} {0} is 30 days long")
	@EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
	void someMonths_Are30DaysLong(Month month) {
		final boolean isALeapYear = false;
		assertEquals(30, month.length(isALeapYear));
	}

	@ParameterizedTest
	@MethodSource("provideStringsForIsBlank")
	void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input, boolean expected) {
		assertEquals(expected, Strings.isNullOrEmpty(input));
	}

	private static Stream<Arguments> provideStringsForIsBlank() {
		return Stream.of(
			Arguments.of(null, true),
			Arguments.of("", true),
			Arguments.of("  ", true),
			Arguments.of("not blank", false)
		);
	}
}
