/**
 * @author gabel - glanphier
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
package tests;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import model.Book;
import model.BookBusinessLogic;

public class TestBookLogic {
	BookBusinessLogic bookBL = new BookBusinessLogic();
	Book book = new Book();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsInStock() {
		book.setStock(5);
		boolean bookStock = bookBL.isInStock(book);
		assertEquals(true, bookStock);
	}
	
	@Test
	public void testCalculatePrice() {
		book.setPrice(9.99);
		double tax = 1.06;
		double priceAfterTax = book.getPrice() * tax;
		double price = bookBL.calculatePrice(book);
		
		assertEquals(priceAfterTax, price, 0.00);
	}
	
	@Test
	public void testIsOnSale() {
		book.setPrice(4.99);
		boolean onSale = bookBL.isOnSale(book);
		
		assertEquals(true, onSale);
	}

}
