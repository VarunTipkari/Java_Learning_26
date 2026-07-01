package com.service;

import java.util.Comparator;
import java.util.List;

import com.book.Book;
import com.dao.BookDao;

public class BookServiceImpl implements BookService {

	private BookDao dao;
	
	//Dependancy Injection
	public BookServiceImpl(BookDao dao) {
		this.dao = dao;
	}
	
	@Override
	public boolean save(Book b) {
		return dao.save(b);
	}

	@Override
	public Book find(int isbn) throws BookNotFoundException {
		Book b = dao.find(isbn);
		if(b == null) {
			throw new BookNotFoundException("Book not found with ISBN :"+isbn);
		}
		return b;
	}

	@Override
	public List<Book> list() {
		return dao.list();
	}

	@Override
	public boolean delete(int isbn) throws BookNotFoundException {
		if(!dao.delete(isbn)) throw new BookNotFoundException("Book not found with ISBN :"+isbn); 
		return true;
	}

	@Override
	public List<Book> findByPrice(double min, double max) {
		return dao.findByPrice(min, max);
	}
	
	@Override
	public List<Book> listOrderByTitle() {
		
		Comparator<Book> compTitle = (b1,b2) -> b1.getTitle().compareTo(b2.getTitle());
		
		List<Book> list = dao.list();
		list.sort(compTitle);
		
		return list;
		
	}

}
