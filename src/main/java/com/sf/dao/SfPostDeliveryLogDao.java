package com.sf.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sf.model.SfPostDeliveryLog;

@Repository
public interface SfPostDeliveryLogDao {
	List<SfPostDeliveryLog> getDeliveryLogByPage(int index,int pageSize);
	int insertDeliveryLog(SfPostDeliveryLog log);
	int updateDeliveryEnd(SfPostDeliveryLog log);
	SfPostDeliveryLog getSfPostDeliveryLogByMonthcard(String monthly_card_no);
}
