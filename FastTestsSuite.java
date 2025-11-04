package com.arb.statefull;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestDivideCalculator.class, TestAddCalculator.class })
public class FastTestsSuite {

}


