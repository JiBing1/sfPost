package com.sf.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sf.model.User;

@Repository
public interface UserDao {
	List<User> getUsers();
	User getUser(User username);
	int addUser(User user);
	int deleteUser(int userid);
}
