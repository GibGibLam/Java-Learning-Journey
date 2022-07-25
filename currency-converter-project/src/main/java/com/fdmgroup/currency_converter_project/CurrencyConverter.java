package com.fdmgroup.currency_converter_project;

import java.util.Map;

public class CurrencyConverter {

	XMLParser p = new XMLParser();
	double result;

	public double convertTo(double amount, String currency) {
		Map<String, Double> cMap = p.getConverterMap();
		System.out.println(cMap);
		if (cMap.containsKey(currency) == true) {
			double rate = cMap.get(currency);
			System.out.println("The rate conversion is " + rate);
			result = amount / rate;
			System.out.println(
					"Converting " + currency + " of " + amount + " to Euro gives " + String.format("%.3f", result));
			return result;
		}
		if (cMap.containsKey(currency) == false) {
			System.out.println("Currency you have inputted not found.");
			return -1;
		}
		return result;
	}

	public double convertFrom(double amount, String currency) {
		Map<String, Double> cMap = p.getConverterMap();
		if (cMap.containsKey(currency)) {
			double rate = cMap.get(currency);
			System.out.println("The rate conversion is " + rate);
			result = amount * rate;
			System.out.println(
					"Convert from Euro: " + amount + " gives " + String.format("%.3f", result) + " of " + currency);
			return result;
		}
		if (!cMap.containsKey(currency)) {
			System.out.println("Currency you have inputted not found. Please try again.");
			return -1;
		}
		return result;
	}
}
