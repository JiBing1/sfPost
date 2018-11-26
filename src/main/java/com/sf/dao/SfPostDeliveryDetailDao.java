package com.sf.dao;

import org.springframework.stereotype.Repository;

import com.sf.model.SfPostDeliveryDetail;

@Repository
public interface SfPostDeliveryDetailDao {
	int insertDeliveryDetail(SfPostDeliveryDetail detail);
}
