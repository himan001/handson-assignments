package com.hsbc.model.service;

import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.exception.InvalidContactException;
import com.hsbc.model.beans.Contact;


public interface ContactService {

	public Contact createContact(int userId,Contact contact);
	public List<Contact> getAllcontact(int userId);
	public void deleteContact(int userId, int contactId) throws InvalidContactException;
	public void deleteAll(int userId);
	public void updateName(int userId,int contactId,String Name)throws InvalidContactException;
	public void updatePhone(int userId,int contactId,Long phone)throws InvalidContactException;

}
