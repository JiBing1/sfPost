package com.sf.service;

import java.util.List;

import com.sf.model.Emp;

public interface EmpService {
	List<Emp> getEmpByPage(String index,String pageSize);
}
