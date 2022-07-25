package com.fdmgroup.shopping_application;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	List<Book> basketList = new ArrayList<>();

	public List<Book> getBooksInBasket() {

		return basketList;
	}

	public void addBook(Book... book) {
		for (Book books : book)
			basketList.add(books);

	}

}
