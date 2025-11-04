package com.arb.statefull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

class CsvDataDrivenCalculatorTests {

	@ParameterizedTest
	@CsvFileSource(resources = "/CSV/add_data.csv", numLinesToSkip = 1)
	void addDataDriven(String category, double a, double b, double expected) {
		ActualCalculator calc = new ActualCalculator();
		double result = calc.add(a, b);

		Assertions.assertEquals(expected, result, 0.0001,
				category + " case failed: " + a + " + " + b + " expected " + expected + " but got " + result);
		System.out.println(category + " case passed: " + a + " + " + b + " = " + result);
	}
}


