package org.carrot84.algorithms;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Time;
import java.text.ParseException;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class TimeConversionTest {
	@ParameterizedTest
	@MethodSource("provideArguments")
	void timeConversionTest(String input, String expected) {
		assertThat(TimeConversion.Result.timeConversion(input)).isEqualTo(expected);
	}

	@ParameterizedTest
	@MethodSource("provideArguments")
	void timeConversion2Test(String input, String expected) throws ParseException {
		assertThat(TimeConversion.Result.timeConversion2(input)).isEqualTo(expected);
	}



	private static Stream<Arguments> provideArguments() {
		return Stream.of(
			Arguments.of("12:00:00AM", "00:00:00"),
			Arguments.of("12:00:00PM", "12:00:00"),
			Arguments.of("07:05:45AM", "07:05:45"),
			Arguments.of("07:05:45PM", "19:05:45")
		);
	}

}