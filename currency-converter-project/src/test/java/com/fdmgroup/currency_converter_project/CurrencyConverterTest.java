package com.fdmgroup.currency_converter_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CurrencyConverterTest {
	CurrencyConverter currencyConverter;
	XMLParser p;
	
	@BeforeEach
	public void init() {
		currencyConverter = new CurrencyConverter();
		p = new XMLParser(); 
	}
	@Test
	void test_Returns841_When1000AmountAndUSDIsInputtedToConvertToEuro_WhenConvertToMethodIsCalled() {
		p.parserXML();
		assertEquals(841, (int)(currencyConverter.convertTo(1000, "USD")));
	}
	@Test
	void test_Returns1188_When1000AmountAndUSDIsInputtedToConvertFromEuro_WhenConvertFromMethodIsCalled() {
		p.parserXML();
		assertEquals(1188, (int)currencyConverter.convertFrom(1000, "USD"));
	}

}
