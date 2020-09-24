package com.exam.model.beans;

public class RetailProduct  {
	
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int quantity;
	
	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public RetailProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RetailProduct(int itemCode, String itemName, double unitPrice, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	


}
