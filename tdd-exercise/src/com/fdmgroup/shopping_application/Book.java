package com.fdmgroup.shopping_application;

public class Book {

	double price;

	public Book() {
		this(0.0);
	}

	public Book(double price) {
		this.price = price;
	}

	public double getPrice() {

		return price;
	}

}
