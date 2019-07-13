package com.cg.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pos.entity.PizzaDetailsDTO;
import com.cg.pos.exception.PizzaException;
import com.cg.pos.service.PizzaService;
@RestController
public class PizzaController {
	
	@Autowired
	PizzaService pizzaService;
	
	public void setPizzaService(PizzaService pizzaService) {
		this.pizzaService = pizzaService;
	}
	PizzaDetailsDTO detailsDTO= new PizzaDetailsDTO();
	//PizzaDetailsDTO result;
	@RequestMapping(value="/modify/name",method = RequestMethod.PUT, produces = "application/json",consumes="application/json")
	public PizzaDetailsDTO modifyName(@RequestBody PizzaDetailsDTO dto)
	{
		System.out.println("controller");
		
		try {
			detailsDTO=pizzaService.modify(dto);
		} catch (PizzaException e) {
			e.printStackTrace();
		}
		return detailsDTO;
	}
	@RequestMapping(value="/modify/cost",method = RequestMethod.PUT, produces = "application/json",consumes="application/json")
	public PizzaDetailsDTO modifyCost(@RequestBody PizzaDetailsDTO dto)
	{
		System.out.println("controller");
		
		try {
			detailsDTO=pizzaService.modify(dto);
		} catch (PizzaException e) {
			e.printStackTrace();
		}
		return detailsDTO;
	}
	@RequestMapping(value="/modify/quantity",method = RequestMethod.PUT, produces = "application/json",consumes="application/json")
	public PizzaDetailsDTO modifyQuantity(@RequestBody PizzaDetailsDTO dto)
	{
		System.out.println("controller");
		
		try {
			detailsDTO=pizzaService.modify(dto);
		} catch (PizzaException e) {
			e.printStackTrace();
		}
		return detailsDTO;
	}
	@RequestMapping(value="/delete",method = RequestMethod.PUT, headers = "Accept=application/json")
	public PizzaDetailsDTO delete(@RequestBody PizzaDetailsDTO dto)
	{
		
		detailsDTO=pizzaService.deletePizzaDetails(dto);
		return detailsDTO;
	}
	

}
