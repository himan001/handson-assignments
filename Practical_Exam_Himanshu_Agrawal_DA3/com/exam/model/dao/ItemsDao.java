package com.exam.model.dao;

import java.util.List;

import com.exam.model.beans.RetailProduct;

public interface ItemsDao {

	public RetailProduct addProduct(RetailProduct retailproduct);
	public List<RetailProduct>  fetchByCode(int itemcode);
}
