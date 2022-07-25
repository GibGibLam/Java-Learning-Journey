package com.fdmgroup.generics_exercise.library;

public class CatalogApp {
	public static void main(String[] args) {
		Catalog<ILibraryItem<Number>, Number> libCatalog = new Catalog<>();
		libCatalog.addItem(new Books(123, "Book1"));
		System.out.println(libCatalog.getItem(123));
		
		libCatalog.addItem(new Borrowers(321, "Noob"));
		System.out.println(libCatalog.getItem(321));
	}

}
