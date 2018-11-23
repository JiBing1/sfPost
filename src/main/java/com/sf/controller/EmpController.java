package com.sf.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sf.base.BaseController;
import com.sf.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController extends BaseController {
	@Autowired
	private EmpService empService;
	
	@RequestMapping(value="/getEmps",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getEmpsByPage (@RequestParam(value="index",required=true) String index,
						@RequestParam(value="pageSize",required=true) String pageSize) {
		return retContent(0,empService.getEmpByPage(index, pageSize));
		
	}
}
