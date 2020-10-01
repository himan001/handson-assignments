package com.hsbc.model.dao;


import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.beans.User;

public interface UserDao {
	public User authenticate(int userId, String password) throws AuthenticationException;
	public User store(User user);
	public User updateUser(int userId, User user);
	public void DeleteUser(int userId);
	public User fetchUserById(int userId);
}
