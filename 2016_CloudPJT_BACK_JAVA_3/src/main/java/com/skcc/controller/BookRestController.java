package com.skcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.domain.book.Book;
import com.skcc.service.book.BookServiceImpl;

@RestController
public class BookRestController {

	private BookServiceImpl	 bs;
	
	
	@Autowired
	public BookRestController(BookServiceImpl bs) {
		this.bs = bs;
	}
	
	@RequestMapping(path = "/book",method=RequestMethod.GET)
	public List<Book> book() {
	  return bs.getBookFindAll();
	}
	
	@RequestMapping(path = "/book/{book_id}", method=RequestMethod.PUT)
	public void UpdateBookStatus(@RequestBody Book book, @PathVariable int book_id ) {
		bs.updateBookStatus(book, book_id);
	}
	
		

}
