package com.exam.model.business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.exam.exception.CategoryDoesntExistException;
import com.exam.exception.ItemCodeException;
import com.exam.model.beans.Apparel;
import com.exam.model.beans.FoodItems;
import com.exam.model.beans.RetailProduct;
import com.exam.model.dao.ItemsDao;
import com.exam.model.utility.Type;
import com.exam.model.utility.UserFactory;

public class ItemServiceImpl implements ItemService {
	
	private ItemsDao dao;
	private List<RetailProduct> food = new ArrayList<RetailProduct>();
	private List<RetailProduct> apparel = new ArrayList<RetailProduct>();
	private List<RetailProduct> electroincs = new ArrayList<RetailProduct>();

	public ItemServiceImpl() {
		dao = (ItemsDao)UserFactory.getInstance(Type.DAO);		
	}

	@Override
	public RetailProduct addProduct(int itemCode, String itemName, double unitPrice, int quantity,
			LocalDate dateOfManifact, LocalDate dateOfExpiry, boolean isVegetarian) {
		// TODO Auto-generated method stub
		
		RetailProduct product = new FoodItems (itemCode,itemName,unitPrice,quantity,dateOfManifact,dateOfExpiry,isVegetarian);
		food.add(product);
		
		return product;
	}

	@Override
	public RetailProduct addProduct(int itemCode, String itemName, double unitPrice, int quantity, String size,
			boolean material) {
		// TODO Auto-generated method stub
		RetailProduct product = new Apparel(itemCode,itemName,unitPrice,quantity,size,material);
		apparel.add(product);
		return product;
	}

	@Override
	public RetailProduct addProduct(int itemCode, String itemName, double unitPrice, int quantity, int warranty) {
		// TODO Auto-generated method stub
		RetailProduct product = new RetailProduct(itemCode,itemName,unitPrice,quantity,warranty);
		electroincs.add(product);
		return product;
	}
	public RetailProduct getproduct(int code) throws CategoryDoesntExistException,ItemCodeException{
		return null;
		
	}

}
