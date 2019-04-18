package com.sxt.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class GlobalException implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception ex) {
		ModelAndView mv=new ModelAndView();
		if(ex instanceof ArithmeticException){
			mv.setViewName("error1");
		}
		if(ex instanceof NullPointerException){
			mv.setViewName("error2");
		}
		mv.addObject("error", ex.toString());
		return mv;
	}
	
}
