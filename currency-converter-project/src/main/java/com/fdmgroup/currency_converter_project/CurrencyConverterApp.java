package com.fdmgroup.currency_converter_project;

import java.util.Scanner;

public class CurrencyConverterApp {

	public static void main(String[] args) {
		XMLParser p = new XMLParser();
		CurrencyConverter currencyConverter = new CurrencyConverter();
		Validator v = new Validator();

		System.out.println("Welcome to No.1 Euro Currency Converter App by Gibson Lam!");
		System.out.println("Below are the conversion rates vs Euro for your reference.");
		p.parserXML();
		System.out.println("Input q to exit application at any point.");
		System.out.println("Do you wish to convert :");
		System.out.println("1. From Euro");
		System.out.println("2. To Euro");
		Scanner scanner = new Scanner(System.in);
		String choiceT = scanner.nextLine();
		v.exitQ(choiceT);
		int choice = Integer.parseInt(choiceT);
		v.choiceRecursive(choice);
		System.out.println("Please input the amount you wish to convert:");
		String amountT = scanner.nextLine();
		v.exitQ(amountT);
		double amount = Double.parseDouble(amountT);
		v.amountRecursive(amount);
		System.out.println("Please enter the currency you wish to convert : e.g USD");
		String currency = (scanner.nextLine()).toUpperCase();
		v.exitQ(currency);
		if (choice == 1) {
			double result = currencyConverter.convertFrom(amount, currency);
			while (result == -1) {
				v.currencyFromRecursive(amount, currency);
			}
		}
		if (choice == 2) {
			double result = currencyConverter.convertTo(amount, currency);
			while (result == -1) {
				v.currencyToRecursive(amount, currency);
			}
		}

	}
}
