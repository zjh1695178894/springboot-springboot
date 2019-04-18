package com.sxt.exception;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
//缺点：无法指定异常对象，不能传递ModelAndView
@Configuration
public class GlobalException {
	@Bean
		public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
		SimpleMappingExceptionResolver resolver=new SimpleMappingExceptionResolver();
		Properties mappings=new Properties();
		mappings.put("java.lang.ArithmeticException", "error1");
		mappings.put("java.lang.NullPointerException", "error2");
		
		resolver.setExceptionMappings(mappings);
		return resolver;
		}
}
