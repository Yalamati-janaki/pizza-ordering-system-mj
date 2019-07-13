package com.cg.pos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="store")
public class StoreDetailsDTO {

	@Id
	private int storeId;
	private String storeName;
	private String storeAddress;
	private String storeContact;
	private String ownerName;
//	@OneToMany(mappedBy="storeId")
//	private List<PizzaDetailsDTO> pizza;
//	
//	
//
//	public List<PizzaDetailsDTO> getPizza() {
//		return pizza;
//	}
//
//	public void setPizza(List<PizzaDetailsDTO> pizza) {
//		this.pizza = pizza;
//	}

	public StoreDetailsDTO() {

	}

	public StoreDetailsDTO(int storeId, String storeName, String storeAddress, String storeContact, String ownerName) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.storeAddress = storeAddress;
		this.storeContact = storeContact;
		this.ownerName = ownerName;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreContact() {
		return storeContact;
	}

	public void setStoreContact(String storeContact) {
		this.storeContact = storeContact;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "StoreDetailEntity [storeId=" + storeId + ", storeName=" + storeName + ", storeAddress=" + storeAddress
				+ ", storeContact=" + storeContact + ", ownerName=" + ownerName + "]" + '\n';
	}

}
