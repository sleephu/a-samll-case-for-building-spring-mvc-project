package edu.neu.coe.api.dao;

import java.util.ArrayList;

import edu.neu.coe.api.model.User;

//CRUD
public interface IUserDAO {

	User create(String firstname, String lastname);
	
	User find(String firstname, String lastname);
	
	User update(String firstname, String lastname);
	
	void delete(String firstname, String lastname);
	
	ArrayList<User> all();
	
}
