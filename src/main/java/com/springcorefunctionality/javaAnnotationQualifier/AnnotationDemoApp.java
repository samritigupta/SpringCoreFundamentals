package com.springcorefunctionality.javaAnnotationQualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
	Spring Autowiring:
	1. for DI, spring can use autowiring.
	2. Spring will look for class that matches the property by type class or interface.
	3. Then, spring will inject it automatically.

	Injection types:
	1. Constructor Injection
	2. Setter Injection
	3. Field Injection (Accomplished using JAVA Reflection. Applies directly on field on need of setter method.)

 */
public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextJavaAnnotation.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoachQ", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
				
		// close the context
		context.close();
		
	}

}


