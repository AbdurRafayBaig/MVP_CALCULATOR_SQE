package com.arb.statefull;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CsvDataDrivenCalculatorTests.class, TestSubtractCalculator.class })
public class SlowTestsSuite {

}


