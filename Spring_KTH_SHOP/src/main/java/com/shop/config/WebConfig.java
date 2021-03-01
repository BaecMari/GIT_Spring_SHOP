package com.shop.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletRegistration;

public class WebConfig extends
        AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        //return new Class[0];
        //아래 내용은 RootConfig.java 작성 후
        return new Class[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //return new Class[0];
        //아래 내용은 ServletConfig.java 작성 후
        //return null;
        return new Class[] {ServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        //return new String[0];
        //return null;
        return new String[] {"/"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        //super.customizeRegistration(registration);
        registration.setInitParameter("throwExceptionIfNoHandlerFound","true");
    }
}
