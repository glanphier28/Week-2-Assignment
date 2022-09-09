/**
 * @author gabel - glanphier
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
package model;

public class BookBusinessLogic {
	public boolean isInStock(Book book) {
		boolean inStock;
		if(book.getStock() > 0) {
			inStock = true;
		} else {
			inStock = false;
		}
		return inStock;
	}
	
	public double calculatePrice(Book book) {
		double tax = 1.06;
		return book.getPrice() * tax;
	}
	
	public boolean isOnSale(Book book) {
		boolean onSale;
		if (book.getPrice() <= 4.99) {
			onSale = true;
		} else {
			onSale = false;
		}
		return onSale;
	}

}
