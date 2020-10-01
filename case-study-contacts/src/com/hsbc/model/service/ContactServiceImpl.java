package com.hsbc.model.service;

import java.util.List;

import com.hsbc.exception.InvalidContactException;
import com.hsbc.model.beans.Contact;
import com.hsbc.model.beans.User;
import com.hsbc.model.dao.ContactDao;
import com.hsbc.model.dao.UserDao;
import com.hsbc.model.util.Type;
import com.hsbc.model.util.UserFactory;

public class ContactServiceImpl implements ContactService {
	
	private ContactDao contactDao = null;
	public ContactServiceImpl() {
		contactDao = (ContactDao)UserFactory.getInstance(Type.CDAO);
	}
	
	@Override
	public Contact createContact(int userId,Contact contact) {
		
		Contact c = contactDao.addContact(userId, contact);
		return c;
	}

	@Override
	public List<Contact> getAllcontact(int userId) {
		
		List<Contact> con = contactDao.fetchAllContact(userId);			
		return con;
	}

	@Override
	public void deleteContact(int userId, int contactId) throws InvalidContactException {
		
		Contact c = contactDao.fetchByid(userId, contactId);
		if(c==null)
			throw new InvalidContactException();
		contactDao.DeleteContact(userId, contactId);
		
	}

	@Override
	public void deleteAll(int userId) {
		
		contactDao.deleteAll(userId);

	}

	@Override
	public void updateName(int userId, int contactId, String name) throws InvalidContactException {
		
		Contact contact = contactDao.fetchByid(userId, contactId);
		
		contact.setName(name);
		Contact c= contactDao.updateContact(userId, contactId,contact);
		
		if(c== null)
			throw new InvalidContactException();
		
	}

	@Override
	public void updatePhone(int userId, int contactId, Long phone) throws InvalidContactException {
	
		Contact contact = contactDao.fetchByid(userId, contactId);
		
		contact.setPhoneNo(phone);
		Contact c= contactDao.updateContact(userId, contactId,contact);
		
		if(c== null)
			throw new InvalidContactException();
	}

}
