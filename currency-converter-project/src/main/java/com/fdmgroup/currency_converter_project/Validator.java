package com.fdmgroup.currency_converter_project;

import java.util.Scanner;

public class Validator {

	CurrencyConverter cc = new CurrencyConverter();

	public void choiceRecursive(int choice) {
		if (choice != 1 && choice != 2) {
			System.out.println("Wrong value inputted. Please try again.");
			System.out.println("Do you wish to convert :");
			System.out.println("1. From Euro");
			System.out.println("2. To Euro");
			Scanner scanner1 = new Scanner(System.in);
			String choiceT = scanner1.nextLine();
			exitQ(choiceT);
			choice = Integer.parseInt(choiceT);
			choiceRecursive(choice);
		}
	}

	public void amountRecursive(double amount) {
		if (amount <= 0) {
			System.out.println("Please input the amount more than 0.");
			System.out.println("Please input the amount you wish to convert:");
			Scanner scanner1 = new Scanner(System.in);
			String amountT = scanner1.nextLine();
			exitQ(amountT);
			amount = Double.parseDouble(amountT);
			amountRecursive(amount);
		}
	}

	public void currencyToRecursive(double amount, String currency) {
		System.out.println("Please enter the currency you wish to test again(else input q to exit): ");
		Scanner scanner1 = new Scanner(System.in);
		currency = (scanner1.nextLine()).toUpperCase();
		exitQ(currency);
		cc.convertTo(amount, currency);
	}

	public void currencyFromRecursive(double amount, String currency) {
		System.out.println("Please enter the currency you wish to test again(else input q to exit): ");
		Scanner scanner1 = new Scanner(System.in);
		currency = (scanner1.nextLine()).toUpperCase();
		exitQ(currency);
		cc.convertFrom(amount, currency);
	}

	public void exitQ(String input) {
		if (input.equals("q") || input.equals("Q")) {
			System.out.println("Thank you for using the app.");
			System.exit(0);
		}
	}
}
