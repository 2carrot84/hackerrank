package org.carrot84;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramsTest {
	@Test
	void isAnagram() {
		assertThat(Anagrams.isAnagram("anagram", "margana")).isTrue();
		assertThat(Anagrams.isAnagram("anagramm", "marganaa")).isFalse();
		assertThat(Anagrams.isAnagram("Hello", "hello")).isTrue();
	}

}