package com.sf.service.impl;

import javax.annotation.PostConstruct;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.dao.UserDao;
import com.sf.model.User;
import com.sf.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	private UserDao userDao;
	@Autowired
	SqlSessionFactory sessionFactory;
	
	@PostConstruct
	public void init(){
		SqlSession session = sessionFactory.openSession();
	    userDao = session.getMapper(UserDao.class);
	}
	
	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return userDao.getUser(user);
	}
	
}
