package com.love2code.javaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
	- Spring will automatically scans your java classes for special annotations
	  and automatically register beans in spring container.

	 - Development steps:
	 1. Enable component scanning in spring config file.
	 2. Add @Component Annotation to your java class
	 3. Retrieve spring from spring container

 */
public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextJavaAnnotation.xml");
		
		// get the bean from spring container
		//Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach theCoach = context.getBean("basketballCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
				
		// close the context
		context.close();
		
	}

}


