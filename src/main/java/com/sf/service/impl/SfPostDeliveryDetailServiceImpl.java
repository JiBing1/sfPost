package com.sf.service.impl;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.dao.SfPostDeliveryDetailDao;
import com.sf.model.SfPostDeliveryDetail;
import com.sf.service.SfPostDeliveryDetailService;

/**
 * 记录整个投柜过程
 * @author 01382697
 * @since 2018-11-28
 */
@Service("sfPostDeliveryDetailService")
public class SfPostDeliveryDetailServiceImpl implements SfPostDeliveryDetailService {
	private final ConcurrentHashMap<String,LinkedBlockingDeque<Boolean>> map 
				= new ConcurrentHashMap<String,LinkedBlockingDeque<Boolean>>();
	private static final String DEFAULT_KEY = "default";	//一个key唯一标识一个post机
	@Autowired
	private SfPostDeliveryDetailDao sfPostDeliveryDetailDao;
	
	/**
	 * 投柜动作
	 * @param
	 * @return
	 * @throws
	 */
	@Override
	public int insertSfPostDeliveryDetail(String postId,SfPostDeliveryDetail detail) throws InterruptedException {
		if(postId == null||"".equals(postId)) postId = DEFAULT_KEY;
		LinkedBlockingDeque<Boolean> queue = map.get(postId);
		if(queue == null) {
			queue = new LinkedBlockingDeque<Boolean>();
			map.put(postId, queue);
		}
		queue.put(true);
		return sfPostDeliveryDetailDao.insertDeliveryDetail(detail);
	}
	
	/**
	 * H5页面检查是否有投柜动作（默认只有一个post机）
	 * @return
	 */
	@Override
	public boolean checkStauts(String postId) throws InterruptedException {
		if(postId == null||"".equals(postId)) postId = DEFAULT_KEY;
		LinkedBlockingDeque<Boolean> queue = map.get(postId);
		if(queue == null) {
			queue = new LinkedBlockingDeque<Boolean>();
			map.put(postId, queue);
		}
		return queue.take();
	}
	
	/**
	 * 投柜完成，中断H5的ajax调用
	 * @throws
	 */
	@Override
	public void completeDelivery(String postId) throws InterruptedException {
		if(postId == null||"".equals(postId)) postId = DEFAULT_KEY;
		LinkedBlockingDeque<Boolean> queue = map.get(postId);
		queue.put(false);
	}
}
