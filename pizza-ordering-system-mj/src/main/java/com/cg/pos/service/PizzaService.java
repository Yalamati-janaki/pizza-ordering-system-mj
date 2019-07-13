package com.cg.pos.service;

import com.cg.pos.entity.PizzaDetailsDTO;
import com.cg.pos.exception.PizzaException;

public interface PizzaService {

	

	PizzaDetailsDTO deletePizzaDetails(PizzaDetailsDTO detailsDTO); 

	PizzaDetailsDTO modify(PizzaDetailsDTO detailsDTO) throws PizzaException; 

}
