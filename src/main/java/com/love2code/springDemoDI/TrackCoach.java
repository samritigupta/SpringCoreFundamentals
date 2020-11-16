package com.love2code.springDemoDI;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	/*
	Since you have defined a constructor in class code, compiler didn’t create default one.
	While creating object you are invoking default one, which doesn’t exist in class code.
	Then the code gives an compilation error.
	 */
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

}










