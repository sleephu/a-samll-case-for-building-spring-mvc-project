package edu.neu.coe.api.service;

import java.util.ArrayList;

import edu.neu.coe.api.model.User;

public interface IUserService {

	User signup(String firstname, String lastname);
	
	User login(String firstname, String lastname);
	
	ArrayList<User> allUser();
}
