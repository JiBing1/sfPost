package com.sf.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sf.base.BaseController;
import com.sf.model.SfPostDeliveryDetail;
import com.sf.service.SfPostDeliveryDetailService;

@RestController
@RequestMapping("/deliveryDetail")
public class SfPostDeliveryDetailController extends BaseController {
	private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	@Autowired
	private SfPostDeliveryDetailService sfPostDeliveryDetailService;
	@RequestMapping("/deliveryInfo")
	@ResponseBody
	public Map<String,Object> delivering(String postId,@RequestParam(value="wayBillNo",required=true)String wayBillNo){
		SfPostDeliveryDetail sfPostDeliveryDetail = new SfPostDeliveryDetail();
		sfPostDeliveryDetail.setDelivery_time(sdf.format(new Date()));
		sfPostDeliveryDetail.setWaybill_no(wayBillNo);
		int result;
		try {
			result = sfPostDeliveryDetailService.insertSfPostDeliveryDetail(postId,sfPostDeliveryDetail);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return retContent(3000,null);
		}
		return retContent(0,result);
	}
	
	@RequestMapping("/listenDeliveryStatus")
	@ResponseBody
	public  Map<String,Object> checkStauts(String postId){
		boolean result;
		try {
			result = sfPostDeliveryDetailService.checkStauts(postId);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return retContent(3001,null);
		}
		return retContent(0,result);
	}
	
	@RequestMapping("/completeDelivery")
	@ResponseBody
	public Map<String,Object> completeDelivery(String postId){
		try {
			sfPostDeliveryDetailService.completeDelivery(postId);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
