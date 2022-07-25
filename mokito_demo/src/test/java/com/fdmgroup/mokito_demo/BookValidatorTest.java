package com.fdmgroup.mokito_demo;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


class BookValidatorTest {
	
	@Mock
	IDatabaseReader databaseReaderMock;
	
	@Mock
	IView viewMock;
	
	@BeforeEach
	public void initialize() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void validateISBN_CallsReadDatabaseOfDatabaseReader_ExactlyOnce() {
		// Arrange
		String isbn = "ABC123";
		BookValidator validator = new BookValidator(databaseReaderMock, viewMock);
		
		// Act
		validator.validateISBN(isbn);
		
		// Assert
		verify(databaseReaderMock, times(1)).readDatabase(isbn);
	}
	 
	@Test
	public void validateISBN_CallsDisplayBookOfView_IfReadISBNReturnsTrue() {
		String isbn = "ABC123";
		BookValidator validator = new BookValidator(databaseReaderMock, viewMock);
		when(databaseReaderMock.readDatabase(isbn)).thenReturn(true);
		
		validator.validateISBN(isbn);
		
		verify(viewMock, times(1)).displayBook(isbn);
		
			
		}
	}

