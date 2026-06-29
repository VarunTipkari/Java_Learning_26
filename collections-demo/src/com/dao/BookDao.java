package com.dao;		//dao means Data Access Object

import java.util.List;

import com.book.Book;

public interface BookDao {

	boolean save(Book b);
	
	Book find(int isbn);
	
	List<Book> list();
	
	boolean delete(int isbn);
	
	List<Book> findByPrice(double min,double max);
	
}
