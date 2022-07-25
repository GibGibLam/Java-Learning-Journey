package com.fdmgroup.shopping_application;

public class Checkout {

	public double calculatePrice(Basket basket) {
		double cost = 0.0;

		int count = 0;
		for (Book Book : basket.getBooksInBasket()) {
			cost += Book.getPrice();
			count++;

		}

		double threeDiscount = 0.01;
		double multipleThree = count / 3;
		if (count < 10) {
			cost *= (1 - (multipleThree * threeDiscount));
		}
		if (count >= 10) {
			double discount = 0.1;
			discount += (multipleThree * threeDiscount);
			cost *= (1 - discount);
		}
		// Round cost to two decimals
		return Math.round(cost * 100.00) / 100.00;
	}

}
