package com.hsbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.beans.User;
import com.hsbc.model.util.DbUtility;

public class JdbcBackedUserDao implements UserDao {

	@Override
	public User authenticate(int userId, String password) throws AuthenticationException {

		User user = null;
		try {
			
			Connection connection = DbUtility.getConnection();
			String loginquery = "Select * from profile where id =? and password = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(loginquery);
			preparedStatement.setInt(1, userId);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				user = new User();
				user.setUserId(resultSet.getInt("id"));
				user.setName(resultSet.getString("name"));
				user.setPassword(resultSet.getString("password"));
				user.setPhone(resultSet.getLong("phone"));
				user.setDob(resultSet.getString("dob"));
				return user;
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
			if(user == null) {
				throw new AuthenticationException("Sorry Username or Password is Incorrect");
			}
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User store(User user) {
		try {
			Connection connection = DbUtility.getConnection();
			
			PreparedStatement sequenceStatement = connection.prepareStatement("values(next value for profile_seq)");
			ResultSet rs = sequenceStatement.executeQuery();
			int seq = 0;
			if(rs.next()) {
				seq = rs.getInt(1);
			} 
			
			String query = "insert into profile values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, seq);
			preparedStatement.setString(2, user.getName());
			preparedStatement.setString(3, user.getPassword());
			preparedStatement.setLong(4, user.getPhone());
			preparedStatement.setString(5, user.getDob());
			preparedStatement.executeUpdate();
			
			user.setUserId(seq);
			preparedStatement.close();
			connection.close();
			}catch(SQLException | ClassNotFoundException e) {
				e.printStackTrace();	
			}
			return user;
	}

	@Override
	public User updateUser(int userId, User user) {
		User user_temp = null;
		try {
			
			Connection connection = DbUtility.getConnection();
			String query = "update profile set password = ?,phone = ? where id =?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, user.getPassword());
			preparedStatement.setLong(2, user.getPhone());
			preparedStatement.setInt(3, userId);

			preparedStatement.executeUpdate();
			preparedStatement.close();

			user_temp = fetchUserById(userId);
			
			connection.close();
			return user_temp;
			
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		return user_temp;
	}

	@Override
	public void DeleteUser(int userId) {
		
		try {
			
			Connection connection = DbUtility.getConnection();
			String query = "delete  from profile where id =?";
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
	public User fetchUserById(int userId) {
		
		User user_temp = null; 
		try {
			Connection connection = DbUtility.getConnection();

		String query = "select * from profile where id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setInt(1,userId);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next())
		{
			user_temp  = new User();
			user_temp.setUserId(resultSet.getInt("id"));
			user_temp.setName(resultSet.getString("name"));
			user_temp.setPassword(resultSet.getString("password"));
			user_temp.setPhone(resultSet.getLong("phone"));	
			user_temp.setDob(resultSet.getString("dob"));
		}
		
		preparedStatement.close();
		resultSet.close();
		connection.close();
		return user_temp;
		
	}catch(SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}

	return user_temp;
	}



}
