package com.fdmgroup.shopping_application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasketTest {

	Basket basket;

	@BeforeEach
	public void init() {
		// Arrange
		basket = new Basket();
	}

	@Test
	@DisplayName("Test 1")
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {
		// Act
		int size = basket.getBooksInBasket().size();
		// Assert
		assertEquals(0, size);

	}

	@Test
	@DisplayName("Test 2")
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
		// Arrange
		Book book1 = new Book(0);
		basket.addBook(book1);
		// Act
		int size = basket.getBooksInBasket().size();
		// Assert
		assertEquals(1, size);
	}

	@Test
	@DisplayName("Test 3")
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTwoBook() {
		// Arrange
		Book book1 = new Book();
		Book book2 = new Book();
		basket.addBook(book1);
		basket.addBook(book2);
		// Act
		int size = basket.getBooksInBasket().size();
		// Assert
		assertEquals(2, size);
	}
}
