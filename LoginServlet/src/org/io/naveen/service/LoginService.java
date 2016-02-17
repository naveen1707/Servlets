package org.io.naveen.service;

import java.util.HashMap;

import org.io.naveen.dto.User;

public class LoginService {
	
	HashMap<String,String> users=new HashMap<String,String>();
	
	public LoginService()
	{
		users.put("naveen1707", "Naveen");
		users.put("sadhu1707", "Sadhu");
	}
	
	public boolean authenticate(String userId,String password)
	{
		if(password.equals(null)|| password.trim().equals(""))
		{
			return false;
		}
		return true;
	}
	public User getuserdetails(String userId)
	{
		User user=new User();
		user.setUserId(userId);
		user.setUsername(users.get(userId));
		return user;
	}

}
