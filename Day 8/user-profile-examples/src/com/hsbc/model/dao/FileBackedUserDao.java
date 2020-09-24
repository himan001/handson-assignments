package com.hsbc.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.hsbc.model.beans.User;

public class FileBackedUserDao implements UserDao,Serializable{
	
	List <User> userList = deserializationUser();
	
	public void serializationUser(List <User> userList) {

	try {
		FileOutputStream fos = new FileOutputStream("fileDb.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(userList); 
		
		fos.flush(); // flushes the output stream
		oos.close();
		fos.close();
	} catch(IOException e) {
		e.printStackTrace();
	}
	}
	
	private List<User> deserializationUser() {
	
		try {
			FileInputStream fis = new FileInputStream("fileDb.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			userList = (List<User>)ois.readObject();
			ois.close();
			fis.close();
			//serializationUser(userList);
		}catch(FileNotFoundException | EOFException e) {
			userList = new ArrayList<User>();
			serializationUser(userList);
		}catch(IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return userList; 

	}

	@Override
	public User store(User user) {
		// TODO Auto-generated method stub
		//userList = deserializationUser();
		this.userList = deserializationUser();
		int generatedId = userList.size()+1;
		user.setUserId(generatedId);
		this.userList.add(user);
		serializationUser(userList);
		return user;
	}

	@Override
	public User[] fetchUsers() {
		// TODO Auto-generated method stub
		this.userList = deserializationUser();
		User [] user = new User[userList.size()];
		user =  userList.toArray(user);
		
		return user;
	}

	@Override
	public User fetchUserById(int userId) {
		// TODO Auto-generated method stub
		userList = deserializationUser();
		Iterator iterator = userList.iterator();
		while(iterator.hasNext()) {
		User tempUser = (User)iterator.next();
		if(tempUser.getUserId()==userId)
			return tempUser;
		}
		return null;
	}

	@Override
	public User updateUser(int userId, User user) {
		// TODO Auto-generated method stub
		int index = 0;
		userList = deserializationUser();
		Iterator iterator = userList.iterator();
		while(iterator.hasNext()) {
			User tempUser = (User)iterator.next();
			if(tempUser.getUserId()==userId) {
				userList.set(index, user);
				serializationUser(userList);
				break;
			}
			index++;

		}
		return user;
	}
}
