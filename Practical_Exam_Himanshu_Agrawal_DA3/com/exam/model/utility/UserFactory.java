package com.exam.model.utility;

import com.exam.model.business.ItemServiceImpl;
import com.exam.model.dao.CollectionBackedItemsDao;

public class UserFactory {

	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAO : 
			obj = new CollectionBackedItemsDao();
			break;
		case SERVICE :
			obj = new ItemServiceImpl();
			break;
		}
		return obj;
	}
}

