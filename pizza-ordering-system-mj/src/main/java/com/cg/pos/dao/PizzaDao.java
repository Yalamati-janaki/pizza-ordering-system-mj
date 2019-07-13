package com.cg.pos.dao;

import com.cg.pos.entity.PizzaDetailsDTO;

public interface PizzaDao {

	PizzaDetailsDTO delete(PizzaDetailsDTO detailsDTO);

	PizzaDetailsDTO modify(PizzaDetailsDTO detailsDTO);

}
