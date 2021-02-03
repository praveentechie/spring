package com.example.ap.mongodriver.config;

import javax.annotation.PostConstruct;

import org.apache.cxf.jaxrs.spring.JaxRsConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.ap.mongodriver.MongoDriverApplication;

@Configuration
@EnableAutoConfiguration
@Import({
	JaxRsConfig.class,
	ApplicationConfig.class
})
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MongoDriverApplication.class);
	}

	@PostConstruct
	private void postConst() {
		System.out.println("Post const initializer");
	}

}
