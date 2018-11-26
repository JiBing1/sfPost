package com.sf.service;

import java.util.List;

import com.sf.model.SfPostDeliveryLog;

public interface SfPostDeliveryLogService {
	int insertDeliveryLog(SfPostDeliveryLog recored);
	List<SfPostDeliveryLog> getDeliveryLogByPage(int index,int pageSize);
	int updateDeliveryEndLog(SfPostDeliveryLog recored);
}
