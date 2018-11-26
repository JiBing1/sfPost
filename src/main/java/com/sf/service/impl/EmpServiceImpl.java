package com.sf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.dao.EmpDao;
import com.sf.model.Emp;
import com.sf.service.EmpService;

@Service("empService")
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao empDao;

	@Override
	public List<Emp> getEmpByPage(String index, String pageSize) {
		int currPage = Integer.parseInt(index);
		int pagesize = Integer.parseInt(pageSize);
		return empDao.getEmpsByPage(currPage, pagesize);
	}
	
}
