package com.sf.service;

import com.sf.model.SfPostDeliveryDetail;

public interface SfPostDeliveryDetailService {
	int insertSfPostDeliveryDetail(String postId,SfPostDeliveryDetail detail) throws InterruptedException;
	boolean checkStauts(String postId) throws InterruptedException;
	void completeDelivery(String postId) throws InterruptedException;
}
