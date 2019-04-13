package servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SpringApplication.run(App2.class, args);
	}
	@Bean
	public ServletRegistrationBean getServletRigistrationBean(){
		ServletRegistrationBean bean=new ServletRegistrationBean(new SecondServlet());
		bean.addUrlMappings("/second");
		return bean;
	}

}
