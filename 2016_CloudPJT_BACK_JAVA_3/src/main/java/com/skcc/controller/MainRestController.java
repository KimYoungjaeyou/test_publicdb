package com.skcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.domain.book.Book;
import com.skcc.domain.payment.Payment;
import com.skcc.service.MainService;

@RestController
public class MainRestController {
	
	private MainService service;
	
	@Autowired
	public MainRestController(MainService service) {
		this.service = service;
	}

	@RequestMapping(path = "/requestbook", method=RequestMethod.POST)
	public void requestBook(@RequestBody Book book) {
		service.requestBook(book);
	}
	
	@RequestMapping(path = "/updatebook", method=RequestMethod.PUT)
	public void updateBook(@RequestBody Book book) {
		service.updateBookStatus(book);
	}
	
	@RequestMapping(path = "/payment", method=RequestMethod.PUT)
	public void UpdateBookStatus(@RequestBody Payment payment) {
		service.requestPayment(payment);
	}

}
