package com.example.ap.mongodriver;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongoDriverApplication {
	private static final String URL_MAPPINGS = "/*";

	public static void main(String[] args) {
		SpringApplication.run(MongoDriverApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		CXFServlet cxfServlet = new CXFServlet();
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(cxfServlet, new String[]{URL_MAPPINGS});
		servletRegistrationBean.setLoadOnStartup(1);
		return servletRegistrationBean;
	}
}
