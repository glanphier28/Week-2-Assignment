/**
 * @author gabel - glanphier
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
package model;


public class Book {
	private String title;
	private int stock;
	private double price;
	
	public Book() {
		title = "";
		stock = 0;
		price = 0.00;
	}
	
	public Book(String title, int stock, double price) {
		this.title = title;
		this.stock = stock;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

