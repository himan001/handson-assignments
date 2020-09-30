package com.hsbc.model.service;

import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.beans.User;
import com.hsbc.model.dao.UserDao;
import com.hsbc.model.util.Type;
import com.hsbc.model.util.UserFactory;

public class UserServiceImpl implements UserService{

	private UserDao userDao = null;
	public UserServiceImpl() {
		userDao = (UserDao)UserFactory.getInstance(Type.DAO);
	}
	
	@Override
	public User login(int userId, String password) throws AuthenticationException {
		User user = userDao.authenticate(userId, password);
		if(user == null) {
			throw new AuthenticationException("Sorry something went wrong");
		}
		return user;
	}

	@Override
	public User createUser(User user) {
		
		User user1 = userDao.store(user);
		return user1;
	}

	@Override
	public User updatePhone(int userId, long phone)throws AuthenticationException {
		
		User user = userDao.fetchUserById(userId);
		if(user == null){
			throw new AuthenticationException("Invalid Id.");
		}
			
		user.setPhone(phone);
		User newUser =userDao.updateUser(userId, user);
		return newUser;
	}

	@Override
	public User updatePassword(int userId, String password) throws AuthenticationException{

		User user = userDao.fetchUserById(userId);
		if(user == null){
			throw new AuthenticationException("Invalid Id.");
		}
		user.setPassword(password);
		User newUser =userDao.updateUser(userId, user);
		return newUser;
	}

	@Override
	public User getUser(int userId) throws AuthenticationException{
		
		User user = userDao.fetchUserById(userId);
		if(user == null){
			throw new AuthenticationException("Invalid Id.");
		}
		
		return user;
	}

	@Override
	public List<User> fetchAllUser() {
		
		List<User> user = userDao.fetchAllUsers();
		
		return user;
	}

}
