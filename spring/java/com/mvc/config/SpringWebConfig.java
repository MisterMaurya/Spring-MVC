package com.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.mvc")
public class SpringWebConfig {

	
	
	@Bean
	public ViewResolver getViewResolver(){
	InternalResourceViewResolver internalResourceViewResolver = new  InternalResourceViewResolver();
		internalResourceViewResolver.setViewClass(JstlView.class);
		internalResourceViewResolver.setPrefix("/WEF-INF/views");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
		
		
	}
}
