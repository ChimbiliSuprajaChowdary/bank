package service;
import java.util.ArrayList;
import java.util.List;

import model.User;
public class Bank_services
{
	static List<User> users=new ArrayList<User>();
	public List addUser(User user)
	{
		users.add(user);
		System.out.println("Adding user");
		return users;
		
	}
	
	
}
