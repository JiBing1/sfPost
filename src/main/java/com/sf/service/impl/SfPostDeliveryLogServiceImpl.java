package com.sf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.dao.SfPostDeliveryLogDao;
import com.sf.model.SfPostDeliveryLog;
import com.sf.service.SfPostDeliveryLogService;

@Service("sfPostDeliveryLogService")
public class SfPostDeliveryLogServiceImpl implements SfPostDeliveryLogService{
	@Autowired
	private SfPostDeliveryLogDao sfPostDeliveryLogDao;

	@Override
	public int insertDeliveryLog(SfPostDeliveryLog recored) {
		// TODO Auto-generated method stub
		return sfPostDeliveryLogDao.insertDeliveryLog(recored);
	}

	@Override
	public List<SfPostDeliveryLog> getDeliveryLogByPage(int index, int pageSize) {
		// TODO Auto-generated method stub
		return sfPostDeliveryLogDao.getDeliveryLogByPage(index, pageSize);
	}

	@Override
	public int updateDeliveryEndLog(SfPostDeliveryLog recored) {
		return sfPostDeliveryLogDao.updateDeliveryEnd(recored);
	}

}
