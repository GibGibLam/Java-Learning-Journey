package com.fdmgroup.mocking_maven_exercise;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
	private IReadItemCommand readItemCommand;
	private IWriteItemCommand writeItemCommand;

	List<Book> catalogueList = new ArrayList<>();


	public Catalogue(IReadItemCommand readItemCommandMock) {
		this.readItemCommand = readItemCommandMock;
	}
	
	public Catalogue(IWriteItemCommand writeItemCommandMock) {
		this.writeItemCommand = writeItemCommandMock;
	}

	public boolean addBook(Book book) {
		return writeItemCommand.insertItem(book);
		
	}


	public List<Book> getAllBook() {
		
		return readItemCommand.readAll();
	}

}
