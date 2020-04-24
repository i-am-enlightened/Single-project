package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int ProductId;
	
	private String ProductName;
	private int ProductCost;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getProductCost() {
		return ProductCost;
	}

	public void setProductCost(int productCost) {
		ProductCost = productCost;
	}
}
