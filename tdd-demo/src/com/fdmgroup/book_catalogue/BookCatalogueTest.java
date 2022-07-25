package com.fdmgroup.book_catalogue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookCatalogueTest {
	
	Catalogue catalogue;
	
	@BeforeEach
	public void init() {
		//Arrange - Setup the preconditions/environment
		catalogue = new Catalogue();
	}
	
	@Test
	public void GetAllBooks_ReturnsAListOfZero_WhenTheCatalogueHasNoBooksAdded() {
		
		// Act - call the code under test
		int size = catalogue.getAllBooks().size();
		
		// Assert - check if the test is a pass or fail
		assertEquals(0, size);
	
	}
	
	@Test
	public void GetAllBooks_ReturnsAListOfOne_WhenTheCatalogueHasOneBookAdded() {
		//Arrange
		Book book1 = new Book("Harry Potter");
		catalogue.addBook(book1);
		//Act
		int size = catalogue.getAllBooks().size();
		//Assert
		assertEquals(1, size);
	}

	
}
