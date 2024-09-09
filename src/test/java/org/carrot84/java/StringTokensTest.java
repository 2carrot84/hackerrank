package org.carrot84.java;

import org.junit.jupiter.api.Test;

class StringTokensTest {
	@Test
	void test() {
		StringTokens.tokenizer("He is a very very good boy, isn't he?");
		StringTokens.tokenizer("   ni qgpatcrphwumxtivb");
	}
}