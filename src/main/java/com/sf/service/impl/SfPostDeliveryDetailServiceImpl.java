package com.sf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.dao.SfPostDeliveryDetailDao;
import com.sf.model.SfPostDeliveryDetail;
import com.sf.service.SfPostDeliveryDetailService;

@Service("sfPostDeliveryDetailService")
public class SfPostDeliveryDetailServiceImpl implements SfPostDeliveryDetailService {
	@Autowired
	private SfPostDeliveryDetailDao sfPostDeliveryDetailDao;

	@Override
	public int insertSfPostDeliveryDetail(SfPostDeliveryDetail detail) {
		// TODO Auto-generated method stub
		return sfPostDeliveryDetailDao.insertDeliveryDetail(detail);
	}

}
