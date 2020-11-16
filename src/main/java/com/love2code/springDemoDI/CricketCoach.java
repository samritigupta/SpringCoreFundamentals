package com.love2code.springDemoDI;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    CricketCoach(){

    }

    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team){
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "50 Rounds of ground "+team;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
