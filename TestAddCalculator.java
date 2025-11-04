package com.arb.statefull;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestAddCalculator {

	private static final double EPS = 1e-9;

	@Test
	void add_twoPositiveNumbers() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 5, n2 = 6;
		double result = calculator.add(n1, n2);
		assertEquals(n1 + n2, result, EPS, "add_twoPositiveNumbers failed");
	}

	@Test
	void add_twoNegativeNumbers() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = -5, n2 = -4;
		double result = calculator.add(n1, n2);
		assertEquals(n1 + n2, result, EPS, "add_twoNegativeNumbers failed");
	}

	@Test
	void add_positiveAndNegative() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 9, n2 = -4;
		double result = calculator.add(n1, n2);
		assertEquals(n1 + n2, result, EPS, "add_positiveAndNegative failed");
	}

	@Test
	void add_withZeroFirst() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 0, n2 = 9;
		double result = calculator.add(n1, n2);
		assertEquals(n1 + n2, result, EPS, "add_withZeroFirst failed");
	}

	@Test
	void add_withZeroSecond() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 9, n2 = 0;
		double result = calculator.add(n1, n2);
		assertEquals(n1 + n2, result, EPS, "add_withZeroSecond failed");
	}

	@Test
	void add_decimalNumbers() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 1.2, n2 = 2.8;
		double result = calculator.add(n1, n2);
		assertEquals(n1 + n2, result, EPS, "add_decimalNumbers failed");
	}

	@Test
	void add_largeNumbers() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 999_999, n2 = 1;
		double result = calculator.add(n1, n2);
		assertEquals(n1 + n2, result, EPS, "add_largeNumbers failed");
	}

	@Test
	void add_smallDecimals() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 0.001, n2 = 0.002;
		double result = calculator.add(n1, n2);
		assertEquals(n1 + n2, result, EPS, "add_smallDecimals failed");
	}

	@Test
	void add_negativeDecimal() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = -2.5, n2 = -3.5;
		double result = calculator.add(n1, n2);
		assertEquals(n1 + n2, result, EPS, "add_negativeDecimal failed");
	}

	@Test
	void add_mixedSignsDecimals() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = -1.2, n2 = 2.3;
		double result = calculator.add(n1, n2);
		assertEquals(n1 + n2, result, EPS, "add_mixedSignsDecimals failed");
	}

	@Test
	void add_sameNumbers() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = 7, n2 = 7;
		double result = calculator.add(n1, n2);
		assertEquals(n1 + n2, result, EPS, "add_sameNumbers failed");
	}

	@Test
	void add_withNegativeZero() {
		ActualCalculator calculator = new ActualCalculator();
		double n1 = -0.0, n2 = 5;
		double result = calculator.add(n1, n2);
		assertEquals(n1 + n2, result, EPS, "add_withNegativeZero failed");
	}
}




