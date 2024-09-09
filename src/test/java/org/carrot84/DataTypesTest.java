package org.carrot84;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class DataTypesTest {

	@Test
	void test() {
		DataTypes.print(-150);
		DataTypes.print(150000);
		DataTypes.print(1500000000);
		// DataTypes.print(Long.valueOf(-100000000000000));
	}
}