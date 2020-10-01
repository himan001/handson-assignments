package com.hsbc.model.util;

import com.hsbc.model.dao.JdbcBackedContactDao;
import com.hsbc.model.dao.JdbcBackedUserDao;
import com.hsbc.model.service.ContactServiceImpl;
import com.hsbc.model.service.UserServiceImpl;

public class UserFactory {
	// it can return dao, service or controller instance
	
	
	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAO : 
			obj = new JdbcBackedUserDao();
			break;
		case SERVICE :
			obj = new UserServiceImpl();
			break;
		case CDAO:
			obj = new JdbcBackedContactDao();
			break;
		case CSERVICE :
			obj = new ContactServiceImpl();
			break;
		}
		return obj;
	}
}
