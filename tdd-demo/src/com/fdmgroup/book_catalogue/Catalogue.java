package com.fdmgroup.book_catalogue;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
	
	List<Book> catalogueList = new ArrayList<>();
	
	public List<Book> getAllBooks() {
		return catalogueList;
		
	}

	public void addBook(Book book) {
		catalogueList.add(book);
		
	}

		
}
