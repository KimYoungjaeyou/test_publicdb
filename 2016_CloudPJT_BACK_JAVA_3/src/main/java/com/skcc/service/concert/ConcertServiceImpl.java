package com.skcc.service.concert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcc.domain.concert.Concert;
import com.skcc.repository.ConcertRepository;

@Service
public class ConcertServiceImpl implements ConcertService{
	
	private final ConcertRepository concertRepository;
	
	@Autowired
	public ConcertServiceImpl(ConcertRepository concertRepository) {
		this.concertRepository = concertRepository;
	}


	@Override
	public Concert getConcertByConcertId(int concert_id) {
		// TODO Auto-generated method stub
		return concertRepository.getOne(concert_id);
	}

}
