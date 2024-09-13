package org.carrot84.tutorials;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ClassVsInstanceTest {
	@ParameterizedTest
	@ValueSource(ints = {-1, 0, 1, 30})
	void isValidAgeTest(int age) {
		new ClassVsInstance.Person(age);
	}

	@Test
	void yearPassesTest() {
		ClassVsInstance.Person person = new ClassVsInstance.Person(-1);
		assertThat(person.getAge()).isEqualTo(0);
		person.yearPasses();
		assertThat(person.getAge()).isEqualTo(1);
		person.yearPasses();
		assertThat(person.getAge()).isEqualTo(2);
	}

	@ParameterizedTest
	@ValueSource(ints = {-1, 12, 13, 17, 18, 19})
	void amIOldTest(int age) {
		ClassVsInstance.Person person = new ClassVsInstance.Person(age);
		person.amIOld();
	}

	@ParameterizedTest
	@ValueSource(ints = {-1, 10, 16, 18})
	void integrationTest(int age) {
		ClassVsInstance.Person p = new ClassVsInstance.Person(age);
		p.amIOld();
		for (int j = 0; j < 3; j++) {
			p.yearPasses();
		}
		p.amIOld();
		System.out.println();
	}
}