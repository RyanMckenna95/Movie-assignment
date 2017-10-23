package controllers;

import java.util.Collection;
import java.util.*;

import models.User;
public class LikeMovieAPI {
	
	private Map<Long,User>userIndex=new HashMap<>();
	
	
	public Collection<User>getUser()
	{
		return userIndex.values();
	}
	
	public void removeUsers()
	{
		userIndex.clear();
	}

	public User addUser(String firstName, String lastName, int age, String gender,String occupation, String zipCode)
	{
		User user=new User(firstName,lastName,age,gender,occupation,zipCode);
		userIndex.put(user.userID, user);
		return user;
	}
	
	public User getUserRatings(long userID)
	{
		return userIndex.get(userID);
	}
	
	public void deleteUser(long userID)
	{
		User user=userIndex.remove(userID);
	}
}
