package com.hsbc.model.util;

import com.hsbc.model.dao.JdbcBackedDao;
import com.hsbc.model.service.UserServiceImpl;

public class UserFactory {
	// it can return dao, service or controller instance
	
	
	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAO : 
			obj = new JdbcBackedDao();
			break;
		case SERVICE :
			obj = new UserServiceImpl();
			break;
		}
		return obj;
	}
}
