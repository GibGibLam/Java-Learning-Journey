package com.fdmgroup.mocking_maven_exercise;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CatalogueTest {
	
	@Mock
	IReadItemCommand readItemCommandMock;
	
	@Mock
	List<Book> ListofBookMock;
	
	@Mock
	IWriteItemCommand writeItemCommandMock;
	
	@Mock
	Book bookMock;
	
	@BeforeEach
	public void initialize() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	@DisplayName("Test 1")
	public void test_GetAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue(){
		// Arrange
		Catalogue catalogue = new Catalogue(readItemCommandMock);
		// Act
		List<Book> booklist = catalogue.getAllBook();
		
		// Assert
		assertEquals(0, booklist.size());
	}
	
	@Test
	@DisplayName("Test 2")
	public void test_GetAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
		Catalogue catalogue = new Catalogue(readItemCommandMock);
		
		catalogue.getAllBook();
		
		verify(readItemCommandMock, times(1)).readAll();
	}

	@Test
	@DisplayName("Test 3")
	public void test_GetAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled(){
		
		Catalogue catalogue = new Catalogue(readItemCommandMock);
		when(readItemCommandMock.readAll()).thenReturn(ListofBookMock);
		
		List<Book> ListofBooks = catalogue.getAllBook();
		
		assertEquals(ListofBooks, ListofBookMock);
		
	}
	
	@Test
	@DisplayName("Test 4")
	public void test_AddBook_CallsInsertItemMethodOfWriteItemCommand_WhenCalled(){
		Catalogue catalogue = new Catalogue(writeItemCommandMock);
		Book book1 = new Book();
		catalogue.addBook(book1);
		verify(writeItemCommandMock).insertItem(book1);
		
	}
	
	@Test
	@DisplayName("Test 5")
	public void test_MockBook(){
		Catalogue catalogue = new Catalogue(writeItemCommandMock);
		catalogue.addBook(bookMock);
		verify(writeItemCommandMock).insertItem(bookMock);
	}
	
}
