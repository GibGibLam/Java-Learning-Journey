package com.fdmgroup.tdd.taxcalculator;

public class ScottishTaxCalculator implements TaxCalculationService {

	@Override
	public double getTaxRate(double income) {
		double result = 0.0;
		if (income <= 11500)
			result = 0.0;
		else if (income >= 11501 && income <= 13850)
			result = 19.0;
		else if (income >= 13851 && income <= 24000)
			result = 20.0;
		else if (income >= 24001 && income <= 44273)
			result = 21.0;
		else if (income >= 44274 && income <= 150000)
			result = 41.0;
		else if (income > 150000)
			result = 46.0;
		return result;
	}

}
