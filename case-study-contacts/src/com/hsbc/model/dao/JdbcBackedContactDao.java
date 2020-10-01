package com.hsbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.exception.InvalidContactException;
import com.hsbc.model.beans.Contact;
import com.hsbc.model.beans.User;
import com.hsbc.model.util.DbUtility;

public class JdbcBackedContactDao implements ContactDao {

	@Override
	public Contact addContact(int userId, Contact contact) {
		
		try {
			Connection connection = DbUtility.getConnection();
			
			PreparedStatement sequenceStatement = connection.prepareStatement("values(next value for contact_seq)");
			ResultSet rs = sequenceStatement.executeQuery();
			int seq = 0;
			if(rs.next()) {
				seq = rs.getInt(1);
			} 
			
			String query = "insert into profile_contacts values(?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, seq);
			preparedStatement.setString(2, contact.getName());
			preparedStatement.setLong(3, contact.getPhoneNo());
			preparedStatement.setInt(4, userId);
			preparedStatement.executeUpdate();
			
			contact.setContactId(seq);
			preparedStatement.close();
			connection.close();
			}catch(SQLException | ClassNotFoundException e) {
				e.printStackTrace();	
			}
			return contact;
	}


	@Override
	public void DeleteContact(int userId, int contactId) {
		try {
			Connection connection = DbUtility.getConnection();
			
			String query = "delete from profile_contacts where cid = ? and refid = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, contactId);
			preparedStatement.setInt(2, userId);
		
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			connection.close();
			}catch(SQLException | ClassNotFoundException e) {
				e.printStackTrace();	
			}
		
	}

	@Override
	public List<Contact> fetchAllContact(int userId) {

		List<Contact> contactList = new ArrayList<Contact>();
		Contact contact = null;
		try {
			Connection connection = DbUtility.getConnection();
			String query = "select * from profile_contacts where refid = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				contact  = new Contact();
				contact.setContactId(resultSet.getInt("cid"));
				contact.setName(resultSet.getString("name"));
				contact.setPhoneNo(resultSet.getLong("phoneNo"));
				contact.setRefId(resultSet.getInt("refid"));
				contactList.add(contact);				
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
			}catch(SQLException | ClassNotFoundException e) {
				e.printStackTrace();	
			}
			return contactList;
	}

	@Override
	public Contact fetchByid(int userId, int contactId) {
		Contact contact = null;
		try {
			Connection connection = DbUtility.getConnection();
			String query = "select * from profile_contacts where refid = ? and cid = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, userId);
			preparedStatement.setInt(2, contactId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				contact  = new Contact();
				contact.setContactId(resultSet.getInt("cid"));
				contact.setName(resultSet.getString("name"));
				contact.setPhoneNo(resultSet.getLong("phoneNo"));
				contact.setRefId(resultSet.getInt("refid"));
				
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
			}catch(SQLException | ClassNotFoundException e) {
				e.printStackTrace();	
			}
			return contact;
	}

	@Override
	public void deleteAll(int userId) {
		
		try {
			Connection connection = DbUtility.getConnection();
			
			String query = "delete  from profile_contacts where refid = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, userId);
		
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			connection.close();
			}catch(SQLException | ClassNotFoundException e) {
				e.printStackTrace();	
			}
	}

	@Override
	public Contact updateContact(int userId, int contactId, Contact contact) {
		Contact contact1 = null;
		try {
			
			Connection connection = DbUtility.getConnection();
			String query = "update profile_contacts set name = ?, phoneNo = ? where cid = ? and refid =?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, contact.getName());
			preparedStatement.setLong(2, contact.getPhoneNo());
			
			preparedStatement.setInt(3, contactId);
			preparedStatement.setInt(4, userId);

			preparedStatement.executeUpdate();
			
			contact1 = fetchByid(userId, contactId);
			preparedStatement.close();
			connection.close();
			
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		return contact1;
	}

}
