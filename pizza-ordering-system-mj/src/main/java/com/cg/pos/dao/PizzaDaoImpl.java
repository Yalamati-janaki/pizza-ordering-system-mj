package com.cg.pos.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.pos.entity.PizzaDetailsDTO;

@Repository
@Transactional
public class PizzaDaoImpl implements PizzaDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
	}

	public PizzaDetailsDTO delete(PizzaDetailsDTO detailsDTO) {

		
		Query query = em.createQuery("delete from PizzaDetailsDTO p where p.itemId=:itemId");
		query.setParameter("itemId", detailsDTO.getItemId());
		
		int i = query.executeUpdate();
		PizzaDetailsDTO result=new PizzaDetailsDTO();
		if (i == 1) {
			result = detailsDTO;
		}
		return result;
	}

	public PizzaDetailsDTO modify(PizzaDetailsDTO detailsDTO) {
		PizzaDetailsDTO result=null;
		result=new PizzaDetailsDTO();
		
		if (detailsDTO.getItemName() != null) {
//			Query query = em.createQuery("update  PizzaDetailsDTO p set p.itemName=:itemName where p.itemId=:itemId");
//			System.out.println(detailsDTO.getItemName());
//			query.setParameter("itemName", detailsDTO.getItemName());
//			query.setParameter("itemId", detailsDTO.getItemId());
//			int i = query.executeUpdate();
//			if (i == 1) {
//				 result=em.find(PizzaDetailsDTO.class, detailsDTO.getItemId());
//			System.out.println(result);
//				result= detailsDTO;
//			}
			 result=em.find(PizzaDetailsDTO.class, detailsDTO.getItemId());
			 if(result!=null) {
				 result.setItemName(detailsDTO.getItemName());
			 }
			 
		}
		if (detailsDTO.getCost() != 0) {
			Query query = em.createQuery("update  PizzaDetailsDTO p set p.cost=:cost where p.itemId=:itemId");
			query.setParameter("cost", detailsDTO.getCost());
			query.setParameter("itemId", detailsDTO.getItemId());
			
			int i = query.executeUpdate();
			System.out.println(i);

			if (i == 1) {
				result = detailsDTO;
			}
		}
		if (detailsDTO.getQuantity() != 0) {
			Query query = em.createQuery("update  PizzaDetailsDTO p set p.quantity=:quantity where p.itemId=:itemId");
			query.setParameter("quantity", detailsDTO.getQuantity());
			query.setParameter("itemId", detailsDTO.getItemId());
			int i = query.executeUpdate();
			if (i == 1) {
				result = detailsDTO;
			}
		}
		return result;

	}
}
