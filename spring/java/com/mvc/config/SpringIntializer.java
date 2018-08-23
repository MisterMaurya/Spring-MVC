package com.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringIntializer  extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	
		return new Class<?>[] {SpringWebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[]{"/"};
	}

}
