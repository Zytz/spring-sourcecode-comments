package com.john.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author:wenwei
 * @date:2020/03/13
 * @description:
 */
@Controller
@RequestMapping("/demo")
public class DemoContoller {


	@RequestMapping("/handletest")
	public String getHandle(String name, ModelMap modelMap){
		System.out.println("handle");
		Date date = new Date();
		modelMap.addAttribute("date",date);
		return "success";
	}
}
