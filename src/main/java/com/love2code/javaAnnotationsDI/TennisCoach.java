package com.love2code.javaAnnotationsDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Spring will automatically register it with default bean id.
@Component
public class TennisCoach implements Coach {

	//private FortuneService fortuneService;

	// If writing autowired field injection, no need for setter or construction injection. Spring will automatically do
	// it using Java reflection.
	@Autowired
	private FortuneService fortuneService;

	public TennisCoach(){
		System.out.println("Inside default Constructor Tennis Coach");
	}

	// Constructor Injection
	/*@Autowired
	public TennisCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}*/

	// Setter Injection
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}*/

	// now no need to give setter method. we can give any method name and just use autowired.
	/*@Autowired
	public void doCrazyfortuneService(FortuneService fortuneService){
		System.out.println("Inside doCrazyfortuneService Tennis Coach");
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
