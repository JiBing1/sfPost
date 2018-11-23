package com.sf.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.dao.EmpDao;
import com.sf.model.Emp;
import com.sf.service.EmpService;

@Service("empService")
public class EmpServiceImpl implements EmpService {
	private EmpDao empDao;
	@Autowired
	SqlSessionFactory sessionFactory;
	
	@PostConstruct
	public void init(){
		SqlSession session = sessionFactory.openSession();
	    empDao = session.getMapper(EmpDao.class);
	}

	@Override
	public List<Emp> getEmpByPage(String index, String pageSize) {
		int currPage = Integer.parseInt(index);
		int pagesize = Integer.parseInt(pageSize);
		return empDao.getEmpsByPage(currPage, pagesize);
	}
	
}
