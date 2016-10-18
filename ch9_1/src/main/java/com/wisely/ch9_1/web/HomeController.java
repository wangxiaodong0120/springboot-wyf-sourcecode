package com.wisely.ch9_1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisely.ch9_1.domain.Msg;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model){
		Msg msg =  new Msg("测试标题","测试内容","额外信息，只对管理员显示");
		model.addAttribute("msg", msg);
		return "home";
	}

}
