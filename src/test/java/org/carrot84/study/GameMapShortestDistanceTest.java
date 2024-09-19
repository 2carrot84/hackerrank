package org.carrot84.study;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GameMapShortestDistanceTest {

	@ParameterizedTest
	@MethodSource("provideArguments")
	void solution(int[][] maps, int expected) {
		assertThat(GameMapShortestDistance.solution(maps)).isEqualTo(expected);
	}

	private static Stream<Arguments> provideArguments() {
		return Stream.of(
			Arguments.of(new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}}, 11),
			Arguments.of(new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}}, -1)
		);
	}
}