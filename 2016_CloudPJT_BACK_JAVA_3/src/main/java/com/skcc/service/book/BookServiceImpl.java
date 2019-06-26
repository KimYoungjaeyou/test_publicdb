package com.skcc.service.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcc.domain.book.Book;
import com.skcc.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	private final BookRepository bookRepository;
	
	@Autowired
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@Override
	public List<Book> getBookFindAll(){
		return bookRepository.findAll();
	}
	

	public void updateBookStatus(Book book,int book_id) {
				
		book.setBook_id(book_id);
		bookRepository.save(book);
		
	}

}
