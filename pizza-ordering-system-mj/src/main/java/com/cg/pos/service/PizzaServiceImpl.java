package com.cg.pos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pos.dao.PizzaDao;
import com.cg.pos.entity.PizzaDetailsDTO;
import com.cg.pos.exception.PizzaException;
import com.cg.pos.utility.Exceptions;


@Service
public class PizzaServiceImpl implements PizzaService {

	
	@Autowired
	PizzaDao dao;
	
	public PizzaDetailsDTO deletePizzaDetails(PizzaDetailsDTO detailsDTO) {
			//PizzaDao pizzaDao = new PizzaDaoImpl();
			return dao.delete(detailsDTO);		
		   
	}
	


	public void setDao(PizzaDao dao) {
		this.dao = dao;
	}



	public PizzaDetailsDTO modify(PizzaDetailsDTO detailsDTO) throws PizzaException {
//		PizzaDao pizzaDao = new PizzaDaoImpl();
		if(dao.modify(detailsDTO)==null) {
			throw new PizzaException(Exceptions.INVALID_ITEMID);
		}
		return dao.modify(detailsDTO);
		
	}
}
