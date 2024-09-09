package org.carrot84;

import static org.assertj.core.api.Assertions.*;

import org.carrot84.java.SubstringComparisons;
import org.junit.jupiter.api.Test;

class SubstringComparisonsTest {
	@Test
	void testSubstring() {
		assertThat(SubstringComparisons.getSmallestAndLargest("welcometojava", 3)).isEqualTo("ava\nwel");
	}

}