package com.charter.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;



@ApplicationPath("/*")
public class HelloWorldApplication extends Application
{
	   private Set<Class<?>> classes = new HashSet<Class<?>>();

	public Set<Class<?>> getClasses() {
		return classes;
	}

	public void setClasses(Set<Class<?>> classes) {
		this.classes = classes;
	}

	public HelloWorldApplication(){
		classes.add(SecurityInterceptor.class);
		classes.add(Hello.class);
	}
}
