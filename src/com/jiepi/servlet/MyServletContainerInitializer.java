package com.jiepi.servlet;

import com.jiepi.service.HelloService;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;
@HandlesTypes(value = HelloService.class)
public class MyServletContainerInitializer implements ServletContainerInitializer{


    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("set========");
        set.stream().forEach(it->{
            System.out.println(it);
        });
    }
}
