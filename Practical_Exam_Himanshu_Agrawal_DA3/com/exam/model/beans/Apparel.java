package com.exam.model.beans;

public class Apparel extends RetailProduct { //retailproduct extend apparel
	
	private String size;		
	private boolean material;

	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apparel(int itemCode, String itemName, double unitPrice, int quantity,String size, boolean material) {
		super(itemCode, itemName, unitPrice, quantity);
		this.size = size;
		this.material = material;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean getMaterial() {
		return material;
	}
	public void setMaterial(boolean material) {
		this.material = material;
	}

}
