package com.hsbc.model.dao;

import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.beans.Contact;
import com.hsbc.model.beans.User;

public interface ContactDao {
	
	public Contact addContact(int userId, Contact contact );
	public void DeleteContact(int userId, int contactId);
	public List<Contact> fetchAllContact(int userId);
	public Contact fetchByid(int userId,int contactId);
	public void deleteAll(int userId);
	public Contact updateContact(int userId,int contactId, Contact contact);

}
