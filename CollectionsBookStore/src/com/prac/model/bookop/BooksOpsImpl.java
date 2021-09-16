package com.prac.model.bookop;

import java.util.ArrayList;
import java.util.HashMap;

import com.prac.model.ppack.Book;

public class BooksOpsImpl implements BookOps{
	
	private ArrayList<Book> blist = new ArrayList<Book>();

	HashMap<Integer, Integer> bmap = new HashMap<Integer, Integer>();
	
	@Override
	public String addBook(Book book) {
		// TODO Auto-generated method stub
		blist.add(book);
		bmap.put(book.getBookId(), book.getBookPrice()*book.getUnits());
		return "Added";
	}

	@Override
	public Book getABook(int bookId) {
		// TODO Auto-generated method stub
		for(Book b:blist) {
			if(b.getBookId()==bookId)
				return b;
		}
		return null;
	}

	@Override
	public ArrayList<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return blist;
	}

	@Override
	public String deleteBook(int bookId) {
		// TODO Auto-generated method stub
		Book book = getABook(bookId);
		if(book!=null) {
			blist.remove(book);
			bmap.remove(bookId);
			return "Deleted";
		}
		return null;
	}

	@Override
	public String updateBook(int bookId, int upbPrice) {
		// TODO Auto-generated method stub
		Book book = getABook(bookId);
		if(book!=null) {
			book.setBookPrice(upbPrice);
			bmap.put(bookId, book.getBookPrice()*book.getUnits());
		}
		return "Updated";
	}

	@Override
	public long getInventoryValue() {
		long amt = 0;
		for(Integer bid:bmap.keySet())
			amt+=bmap.get(bid);
		return amt;
	}
	
}
