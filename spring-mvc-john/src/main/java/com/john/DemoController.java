package com.john;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * @author:wenwei
 * @date:2020/03/11
 * @description:
 */

@Controller
@RequestMapping( path = "/demo")
public class DemoController {

	@RequestMapping(path = "/hand")
	public String handle01(String name, Map<String,Object> model) {
		System.out.println("++++++++handler业务逻辑处理中....");
		Date date = new Date();
		model.put("date",date);
		return "success";
	}


}
