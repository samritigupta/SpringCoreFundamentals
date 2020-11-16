package com.love2code.springDemoDI;

public class MyApp {

	/*
	Dependency Injection :
	The Client delegates calls to another object the responsibility of providing its dependencies.
	Outsource construction of objects.

	Invertion of control: create and manages object
	DI: Inject or provide object's dependencies.

	- Constructor Injection
	- Setter Injection

	- Constructor Injection
	s1. Define the dependency interface and class (Fortune Service and Happy Fortune Service)
	s2. Create a constructor in your class for injection
	s3. Configure the DI in spring config file.
	 */
	public static void main(String[] args) {

		// create the object
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
	}

}
