package edu.neu.coe.api.dao.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import edu.neu.coe.api.dao.IUserDAO;
import edu.neu.coe.api.model.User;

@Repository("userDAO")
public class UserDAOMem implements IUserDAO {

	private ArrayList<User> users = new ArrayList<User>();
	
	public UserDAOMem() {
		User u1 = new User();
		u1.setFirstName("hechen");
		u1.setLastName("Gao");
		User u2 = new User();
		u2.setFirstName("Barney");
		u2.setLastName("Stinson");
		users.add(u1);
		users.add(u2);
	}
	
	@Override
	public ArrayList<User> all() {
		return this.users;
	}
	
	@Override
	public User create(String firstname, String lastname) {
		User user = new User();
		user.setFirstName(firstname);
		user.setLastName(lastname);
		return user;
	}

	@Override
	public User find(String firstname, String lastname) {
		for (User user : users) {
			if (user.getFirstName().equals(firstname) && user.getLastName().equals(lastname)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User update(String firstname, String lastname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String firstname, String lastname) {
		User target = null;
		for (User user : users) {
			if (user.getFirstName().equals(firstname) && user.getLastName().equals(lastname)) {
				target = user;
			}
		}
		if (target != null)
			users.remove(target);
	}

	
	
}
