package com.sf.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
	protected Logger logger = LogManager.getLogger(getClass());
	@ResponseBody
	@RequestMapping("/getList")
	public List<String> getList() {
		logger.error("enter the method");
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		return list;
	}
}
