package com.fdmgroup.shopping_application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CheckoutTest {
	Basket basket;
	Checkout checkout;

	@BeforeEach
	public void init() {
		// Arrange
		basket = new Basket();
		checkout = new Checkout();
	}

	@Test
	@DisplayName("Test 1")
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		// Act
		// Assert
		assertEquals(0.0, checkout.calculatePrice(basket));
	}

	@Test
	@DisplayName("Test 2")
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
		basket.addBook(new Book(1.0));
		assertEquals(1.0, checkout.calculatePrice(basket));
	}

	@Test
	@DisplayName("Test 3")
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoBook() {
		basket.addBook(new Book(1.0), new Book(1.0));
		assertEquals(2.0, checkout.calculatePrice(basket));
	}

	@Test
	@DisplayName("test 4")
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithThreeBook() {
		basket.addBook(new Book(25.99), new Book(25.99), new Book(25.99));
		assertEquals(77.19, checkout.calculatePrice(basket));
	}

	@Test
	@DisplayName("test 5")
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithSevenBook() {
		basket.addBook(new Book(25.99), new Book(25.99), new Book(25.99), new Book(25.99), new Book(25.99),
				new Book(25.99), new Book(25.99));
		assertEquals(178.29, checkout.calculatePrice(basket));
	}

	@Test
	@DisplayName("test 6")
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTenBook() {
		basket.addBook(new Book(25.99), new Book(25.99), new Book(25.99), new Book(25.99), new Book(25.99),
				new Book(25.99), new Book(25.99), new Book(25.99), new Book(25.99), new Book(25.99));
		assertEquals(226.11, checkout.calculatePrice(basket));
	}

	@Test
	@DisplayName("test 7")
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwelveBook() {
		basket.addBook(new Book(25.99), new Book(25.99), new Book(25.99), new Book(25.99), new Book(25.99),
				new Book(25.99), new Book(25.99), new Book(25.99), new Book(25.99), new Book(25.99), new Book(25.99),
				new Book(25.99));
		assertEquals(268.22, checkout.calculatePrice(basket));
	}
}
