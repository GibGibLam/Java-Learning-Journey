package com.fdmgroup.tdd.taxcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ScottishTaxCalculatorTest {
	
	ScottishTaxCalculator cal;
	
	@BeforeEach
	public void init() {
		cal = new ScottishTaxCalculator();
	}
	
	@Test
	public void getTaxRate_ReturnZeroPercent_WhenLessThanEqualsTo11500Passed(){
		assertEquals(0.0, cal.getTaxRate(11499));
	}
	
	@Test
	public void getTaxRate_ReturnTwentyPercent_WhenGreaterThanEqualsTo11501ANDLessThanEqualsTo13850Passed(){
		assertEquals(19.0, cal.getTaxRate(11600));
	}
	@Test
	public void getTaxRate_ReturnTwentyPercent_WhenGreaterThanEqualsTo13851ANDLessThanEqualsTo24000Passed(){
		assertEquals(20.0, cal.getTaxRate(13900));
	}
	@Test
	public void getTaxRate_ReturnTwentyPointOnePercent_WhenGreaterThanEqualsTo24001ANDLessThanEqualsTo44273Passed(){
		assertEquals(21.0, cal.getTaxRate(25000));
	}
	@Test
	public void getTaxRate_ReturnFourtyOnePercent_WhenGreaterThanEqualsTo44274ANDLessThanEqualsTo150000Passed(){
		assertEquals(41.0, cal.getTaxRate(44300));
	}
	@Test
	public void getTaxRate_ReturnFourtySixPercent_WhenGreaterThan150000Passed(){
		assertEquals(46.0, cal.getTaxRate(150300));
	}
}
