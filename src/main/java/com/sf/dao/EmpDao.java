package com.sf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sf.model.Emp;

@Repository
public interface EmpDao {
	public List<Emp> getEmpsByPage(@Param("currPage")int index,@Param("pageSize")int pageSize);
}
