package com.se.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] conClasses = {StudentConfig.class};
		return conClasses;
	}

	@Override
	protected String[] getServletMappings() {
		String mappings[] = {"/"};
		return mappings;
	}

}
