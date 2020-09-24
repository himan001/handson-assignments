package com.exam.model.beans;

import java.time.LocalDate;

public class FoodItems  extends RetailProduct{
	
	private LocalDate dateOfManifact; 
	private LocalDate dateOfExpiry;
	private boolean isVegetarian;

	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodItems(int itemCode, String itemName, double unitPrice, int quantity,LocalDate dateOfManifact, LocalDate dateOfExpiry, boolean isVegetaria) {
		super(itemCode, itemName, unitPrice, quantity);
		this.dateOfManifact = dateOfManifact;
		this.dateOfExpiry = dateOfExpiry;
		this.isVegetarian = isVegetarian;
		// TODO Auto-generated constructor stub
	}

	public LocalDate getDateOfManifact() {
		return dateOfManifact;
	}
	public void setDateOfManifact(LocalDate dateOfManifact) {
		this.dateOfManifact = dateOfManifact;
	}
	public LocalDate getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(LocalDate dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public boolean getVegOrNonveg() {
		return isVegetarian;
	}
	public void setVegOrNonveg(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}

}
