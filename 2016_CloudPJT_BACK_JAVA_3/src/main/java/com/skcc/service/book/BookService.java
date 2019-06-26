package com.skcc.service.book;

import java.util.List;

import com.skcc.domain.book.Book;

public interface BookService {
	
	public List<Book> getBookFindAll();
	public void updateBookStatus(Book book, int book_id);
}
