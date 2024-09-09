package org.carrot84;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateAndTimeTest {
	@Test
	void test() {
		assertThat(DateAndTime.findDay(8, 14, 2017)).isEqualTo("MONDAY");
		assertThat(DateAndTime.findDay(8, 5, 2015)).isEqualTo("WEDNESDAY");
		assertThat(DateAndTime.findDay(9, 9, 2024)).isEqualTo("MONDAY");
	}
}