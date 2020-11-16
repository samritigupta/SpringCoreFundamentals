package com.love2code.javaAnnotations;

import org.springframework.stereotype.Component;

// Spring will automatically register it with below bean id.
@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
