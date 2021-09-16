package com.prac.servicepack;

import java.util.ArrayList;

import com.prac.model.bookop.BooksOpsImpl;
import com.prac.model.ppack.Book;

public class BookServices {
	public static BooksOpsImpl bop = new BooksOpsImpl();
	
	public static String addService(int bookId,String bookName,int bookPrice,int units) {
		Book book = new Book(bookId,bookName,bookPrice,units);
		return bop.addBook(book);
	}
	public static Book getABookService(int bookId) {
		return bop.getABook(bookId);
	}
	public static ArrayList<Book> getAllBooksService(){
		return bop.getAllBooks();
	}
	public static String deleteBookService(int bookId) {
		return bop.deleteBook(bookId);
	}
	public static long getInventoryValueService() {
		return bop.getInventoryValue();
	}
}
