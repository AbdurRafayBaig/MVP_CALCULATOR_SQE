package com.arb.statefull;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestSubtractCalculator {

	private static final double EPS = 1e-9; // Precision tolerance for doubles

	@Test
	void subtractTwoPositiveNumbers() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 10, n2 = 4;
		double result = calculator.subtract(n1, n2);
		assertEquals(n1 - n2, result, EPS, "subtractTwoPositiveNumbers failed");
	}

	@Test
	void subtractTwoNegativeNumbers() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = -8, n2 = -3;
		double result = calculator.subtract(n1, n2);
		assertEquals(n1 - n2, result, EPS, "subtractTwoNegativeNumbers failed");
	}

	@Test
	void subtractPositiveAndNegative() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 7, n2 = -3;
		double result = calculator.subtract(n1, n2);
		assertEquals(n1 - n2, result, EPS, "subtractPositiveAndNegative failed");
	}

	@Test
	void subtractNegativeAndPositive() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = -5, n2 = 3;
		double result = calculator.subtract(n1, n2);
		assertEquals(n1 - n2, result, EPS, "subtractNegativeAndPositive failed");
	}

	@Test
	void subtractWithZeroFirst() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 0, n2 = 9;
		double result = calculator.subtract(n1, n2);
		assertEquals(n1 - n2, result, EPS, "subtractWithZeroFirst failed");
	}

	@Test
	void subtractWithZeroSecond() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 9, n2 = 0;
		double result = calculator.subtract(n1, n2);
		assertEquals(n1 - n2, result, EPS, "subtractWithZeroSecond failed");
	}

	@Test
	void subtractDecimalNumbers() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 5.5, n2 = 2.2;
		double result = calculator.subtract(n1, n2);
		assertEquals(n1 - n2, result, EPS, "subtractDecimalNumbers failed");
	}

	@Test
	void subtractLargeNumbers() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 1_000_000, n2 = 999_999;
		double result = calculator.subtract(n1, n2);
		assertEquals(n1 - n2, result, EPS, "subtractLargeNumbers failed");
	}

	@Test
	void subtractSmallDecimals() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 0.005, n2 = 0.002;
		double result = calculator.subtract(n1, n2);
		assertEquals(n1 - n2, result, EPS, "subtractSmallDecimals failed");
	}

	@Test
	void subtractSameNumbers() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 8, n2 = 8;
		double result = calculator.subtract(n1, n2);
		assertEquals(n1 - n2, result, EPS, "subtractSameNumbers failed");
	}

	@Test
	void subtractNegativeDecimals() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = -3.5, n2 = -2.5;
		double result = calculator.subtract(n1, n2);
		assertEquals(n1 - n2, result, EPS, "subtractNegativeDecimals failed");
	}

	@Test
	void subtractWithNegativeZero() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = -0.0, n2 = 5;
		double result = calculator.subtract(n1, n2);
		assertEquals(n1 - n2, result, EPS, "subtractWithNegativeZero failed");
	}
}


