package org.carrot84.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Regex2Test {
	@Test
	void test() {
		Pattern p = Pattern.compile("\\b(\\w+)", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("Goodbye bye bye world world world");

		while (m.find()) {
			System.out.printf("%d %s%n", m.groupCount(), m.group());
		}
	}

	@Test
	void test1() {
		Pattern p = Pattern.compile("(\\w+)", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("Goodbye bye bye world world world");

		while (m.find()) {
			System.out.printf("%d %s%n", m.groupCount(), m.group());
		}
	}

	@ParameterizedTest
	@ValueSource(strings = {
		"Goodbye bye bye world world world"
		,"Sam went went to to to his business"
		,"Reya is is the the best player in eye eye game"
		,"in inthe"
		,"Hello hello Ab aB"
	})
	void test2(String str) {
		Pattern p = Pattern.compile("\\b(\\w+)(\\s+\\1\\b)+", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(str);

		while (m.find()) {
			System.out.printf("%d, %s, %s%n", m.groupCount(), m.group(0), m.group(1));
			str = str.replaceAll(m.group(), m.group(1));
		}
		System.out.println(str);
	}
}