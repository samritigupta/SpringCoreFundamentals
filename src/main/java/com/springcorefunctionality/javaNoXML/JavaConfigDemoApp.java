package com.springcorefunctionality.javaNoXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
	- Development process
	1. Create Java class and annotate @Configuration
	2. Add Component scan component (@ComponentScan) its optional
	3. Read spring java config class
	4. retrieve bean from spring container.
 */
public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
				
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
					
		// close the context
		context.close();
		
	}

}


