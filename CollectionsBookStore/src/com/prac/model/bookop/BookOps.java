package com.prac.model.bookop;

import java.util.ArrayList;

import com.prac.model.ppack.Book;

public interface BookOps {
	
	String addBook(Book book);
	Book getABook(int bookId);
	ArrayList<Book> getAllBooks();
	String deleteBook(int bookId);
	String updateBook(int bookId,int upbPrice);
	long getInventoryValue();
	
}
