package org.carrot84.tutorials;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class OperatorsTest {

	@ParameterizedTest
	@CsvSource({"100.00, 15, 8", "12.00, 20, 8"})
	void solveTest(double mealCost, int tipPercent, int taxPercent) {
		Operators.Result.solve(mealCost, tipPercent, taxPercent);
	}

}