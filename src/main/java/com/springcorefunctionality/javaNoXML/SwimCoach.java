package com.springcorefunctionality.javaNoXML;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;
    @Value("${foo.email}")
    private String email;

    public  SwimCoach(){

    }

    public SwimCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000m as a warm up. " + email;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
