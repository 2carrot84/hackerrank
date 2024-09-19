package org.carrot84.tutorials;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryNumbersTest {

	@Test
	void splitAndGetMaxLength() {
		assertThat(BinaryNumbers.splitAndGetMaxLength("1111101")).isEqualTo(5);
		assertThat(BinaryNumbers.splitAndGetMaxLength("1101")).isEqualTo(2);
		assertThat(BinaryNumbers.splitAndGetMaxLength("101")).isEqualTo(1);
		assertThat(BinaryNumbers.splitAndGetMaxLength("10")).isEqualTo(1);
		assertThat(BinaryNumbers.splitAndGetMaxLength("0")).isEqualTo(0);
	}

	@Test
	void convertBinary() {
		assertThat(BinaryNumbers.convertBinary(125)).isEqualTo("1111101");
		assertThat(BinaryNumbers.convertBinary(13)).isEqualTo("1101");
		assertThat(BinaryNumbers.convertBinary(5)).isEqualTo("101");
	}
}