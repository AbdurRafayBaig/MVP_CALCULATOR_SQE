package com.arb.statefull;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestDivideCalculator {

	private static final double EPS = 1e-9;

	@Test
	void divideTwoPositives() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 10, n2 = 2;
		double result = calculator.divide(n1, n2);
		assertEquals(n1 / n2, result, EPS, "divideTwoPositives failed");
	}

	@Test
	void divideTwoNegatives() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = -8, n2 = -2;
		double result = calculator.divide(n1, n2);
		assertEquals(n1 / n2, result, EPS, "divideTwoNegatives failed");
	}

	@Test
	void dividePositiveByNegative() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 8, n2 = -4;
		double result = calculator.divide(n1, n2);
		assertEquals(n1 / n2, result, EPS, "dividePositiveByNegative failed");
	}

	@Test
	void divideNegativeByPositive() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = -6, n2 = 3;
		double result = calculator.divide(n1, n2);
		assertEquals(n1 / n2, result, EPS, "divideNegativeByPositive failed");
	}

	@Test
	void divideByZeroPositive() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 5, n2 = 0;
		double result = calculator.divide(n1, n2);
		assertTrue(Double.isInfinite(result), "divideByZeroPositive should return Infinity");
	}

	@Test
	void divideZeroByNumber() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 0, n2 = 5;
		double result = calculator.divide(n1, n2);
		assertEquals(0.0, result, EPS, "divideZeroByNumber failed");
	}

	@Test
	void divideLargeNumbers() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 1000, n2 = 10;
		double result = calculator.divide(n1, n2);
		assertEquals(n1 / n2, result, EPS, "divideLargeNumbers failed");
	}

	@Test
	void divideSmallNumbers() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 0.9, n2 = 0.3;
		double result = calculator.divide(n1, n2);
		assertEquals(n1 / n2, result, EPS, "divideSmallNumbers failed");
	}

	@Test
	void divideFractionalResult() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 5, n2 = 2;
		double result = calculator.divide(n1, n2);
		assertEquals(n1 / n2, result, EPS, "divideFractionalResult failed");
	}

	@Test
	void divideDecimalValues() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 1.5, n2 = 0.5;
		double result = calculator.divide(n1, n2);
		assertEquals(n1 / n2, result, EPS, "divideDecimalValues failed");
	}

	@Test
	void divideZeroByZero() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 0, n2 = 0;
		double result = calculator.divide(n1, n2);
		// Depending on implementation: could be NaN, Infinity, or handled manually
		assertTrue(Double.isNaN(result) || result == 0.0 || Double.isInfinite(result),
				"divideZeroByZero should handle undefined division safely");
	}

	@Test
	void divideNegativeByDecimal() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = -9, n2 = 0.5;
		double result = calculator.divide(n1, n2);
		assertEquals(n1 / n2, result, EPS, "divideNegativeByDecimal failed");
	}
}

