package com.cg.pos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

@Entity
@Table(name = "pizza")
@NamedQueries({
		//@NamedQuery(name = "MODIFY_QUANTITY", query = "update PizzaDetailsDTO p set p.quantity=? where p.itemId=? and p.storeId=?"),
		//@NamedQuery(name = "MODIFY_COST", query = "update PizzaDetailsDTO p set p.cost=? where p.itemId=? and p.storeId=?"),
		//@NamedQuery(name ="DELETE_ROW", query = "delete from PizzaDetailsDTO p where p.itemId=? and p.storeId=?"),
		//@NamedQuery(name = "MODIFY_NAME", query = "update PizzaDetailsDTO p set p.itemName=? where p.itemId=? and p.storeId=?") 
		})

public class PizzaDetailsDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int itemId;

	//@ManyToOne(fetch=FetchType.LAZY)
	private int storeId;
	//private StoreDetailsDTO storeDetails;
//	public StoreDetailsDTO getStoreDetails() {
//		return storeDetails;
//	}
//
//	public void setStoreDetails(StoreDetailsDTO storeDetails) {
//		this.storeDetails = storeDetails;
//	}

	@Column(name = "pizzaname")
	private String itemName;
	private int quantity;
	@Column(name = "price")
	private double cost;
	

	public PizzaDetailsDTO() {

	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public PizzaDetailsDTO(int itemId, int storeId, String itemName, int quantity, double cost) {

		this.itemId = itemId;
		this.storeId = storeId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.cost = cost;
		
	}

	@Override
	public String toString() {
		return "PizzaDetails [itemId=" + itemId + ",storeId=" + storeId + ", itemName=" + itemName + ", quantity="
				+ quantity + ", cost=" + cost + "]" + '\n';
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

}
