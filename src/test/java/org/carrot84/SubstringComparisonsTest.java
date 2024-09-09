package org.carrot84;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubstringComparisonsTest {
	@Test
	void testSubstring() {
		assertThat(SubstringComparisons.getSmallestAndLargest("welcometojava", 3)).isEqualTo("ava\nwel");
	}

}