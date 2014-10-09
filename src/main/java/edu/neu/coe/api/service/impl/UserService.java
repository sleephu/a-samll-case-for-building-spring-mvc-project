package edu.neu.coe.api.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.neu.coe.api.dao.IUserDAO;
import edu.neu.coe.api.model.User;
import edu.neu.coe.api.service.IUserService;

@Service("userService")
public class UserService implements IUserService {

	@Autowired
	private IUserDAO userDAO;
	
	@Override
	public User signup(String firstname, String lastname) {
		return userDAO.create(firstname, lastname);
	}

	@Override
	public User login(String firstname, String lastname) {
		return userDAO.find(firstname, lastname);
	}
	
	@Override
	public ArrayList<User> allUser() {
		return userDAO.all();
	}

}
