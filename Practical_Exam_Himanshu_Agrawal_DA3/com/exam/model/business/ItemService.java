package com.exam.model.business;

import java.time.LocalDate;

import com.exam.exception.CategoryDoesntExistException;
import com.exam.exception.ItemCodeException;
import com.exam.model.beans.RetailProduct;

public interface ItemService {  //Interface for itemservice 

	public RetailProduct addProduct(int itemCode, String itemName, double unitPrice ,int quantityprivate, LocalDate dateOfManifact,	LocalDate dateOfExpiry , boolean isVegetarian);
	public RetailProduct addProduct(int itemCode, String itemName, double unitPrice ,int quantity,String size, boolean material);
	public RetailProduct addProduct(int itemCode, String itemName, double unitPrice ,int quantity, int warranty);

	public RetailProduct getproduct(int code) throws CategoryDoesntExistException,ItemCodeException;
}
