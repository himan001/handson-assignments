package com.exam.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.exam.model.beans.RetailProduct;

public class CollectionBackedItemsDao implements ItemsDao {
	
	private List<RetailProduct> product = new ArrayList<RetailProduct>();

	@Override
	public RetailProduct addProduct(RetailProduct retailproduct) {
		// TODO Auto-generated method stub
		product.add(retailproduct);
		
		return retailproduct;
	}

	@Override
	public List<RetailProduct> fetchByCode(int itemcode) {
		// TODO Auto-generated method stub
		for(RetailProduct prod : product ) {
			if(prod.getItemCode()==itemcode)
				return product;
		}
		return null;
	}

}
