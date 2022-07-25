package com.fdmgroup.mokito_demo;

public class BookValidator {
	private IDatabaseReader databaseReader;
	private IView view;

	
	public BookValidator(IDatabaseReader databaseReader, IView view) {
		this.databaseReader = databaseReader;
		this.view = view;
	}


	public void validateISBN(String isbn) {
		if(databaseReader.readDatabase(isbn))
			view.displayBook(isbn);
	}

}
