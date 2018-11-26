package com.sf.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sf.base.BaseController;
import com.sf.model.SfPostDeliveryLog;
import com.sf.service.SfPostDeliveryLogService;

@RestController
@RequestMapping("/deliveryRecord")
public class SfPostDeliveryLogController extends BaseController {
	@Autowired
	private SfPostDeliveryLogService sfPostDeliveryLogService;
	
	@ResponseBody
	@RequestMapping(value="/createWaybill",method=RequestMethod.POST)
	public Map<String, Object> createDelivery(SfPostDeliveryLog recored) {
		return retContent(0,sfPostDeliveryLogService.insertDeliveryLog(recored));
	}
	
	@ResponseBody
	@RequestMapping(value="/endConfirm",method=RequestMethod.POST)
	public Map<String, Object> endProcess(SfPostDeliveryLog recored) {
		return retContent(0,sfPostDeliveryLogService.updateDeliveryEndLog(recored));
	}
}
