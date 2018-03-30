package com.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.dao.UserDao;
import com.spring.mvc.user.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDAO;
	
	@Transactional
	public void addUser(User User) {
		userDAO.addUser(User);
	}

	@Transactional
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

	@Transactional
	public void deleteUser(Integer UserId) {
		userDAO.deleteUser(UserId);
	}

	public User getUser(int empid) {
		return userDAO.getUser(empid);
	}

	public User updateUser(User User) {
		return userDAO.updateUser(User);
	}

	public UserDao getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDao userDAO) {
		this.userDAO = userDAO;
	}

}

