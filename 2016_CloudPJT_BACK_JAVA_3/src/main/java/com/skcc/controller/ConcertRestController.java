package com.skcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.domain.concert.Concert;
import com.skcc.service.concert.ConcertServiceImpl;

@RestController
public class ConcertRestController {
	
	private ConcertServiceImpl cs;
	
	@Autowired
	public ConcertRestController(ConcertServiceImpl cs) {
		this.cs = cs;
	}

	
	@RequestMapping(path = "/concert/{concert_id}",method=RequestMethod.GET)
	public Concert concert(@PathVariable(value = "concert_id") int concert_id) {
		System.out.println(cs.getConcertByConcertId(concert_id).toString()+"####################");
		Concert test = cs.getConcertByConcertId(concert_id);
		System.out.println("dhkdhkdhkdhkdhkdhk"+test.toString());
		return cs.getConcertByConcertId(concert_id);
	}
}
