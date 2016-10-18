package com.wisely.highlight_springmvc4.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice //1
public class ExceptionHandlerAdvice { 

	@ExceptionHandler(value = Exception.class)//2
	public ModelAndView exception(Exception exception, WebRequest request) {
		ModelAndView modelAndView = new ModelAndView("error");// error页面
		modelAndView.addObject("errorMessage", exception.getMessage());
		return modelAndView;
	}

	@ModelAttribute //3
	public void addAttributes(Model model) {
		model.addAttribute("msg", "额外信息"); //3
	}

	@InitBinder //4
	public void initBinder(WebDataBinder webDataBinder) {
		webDataBinder.setDisallowedFields("id"); //5
	}
}
