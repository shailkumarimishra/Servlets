package com.book.controller;

public class Book {
	private int bookId;
	private String bookName;
	private double cost;

	public Book(int bookId, String bookName, double cost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.cost = cost;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
