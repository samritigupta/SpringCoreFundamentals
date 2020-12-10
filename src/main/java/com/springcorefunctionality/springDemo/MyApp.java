package com.springcorefunctionality.springDemo;

public class MyApp {

    /*
     -- Demonstrates need to hardcode different object creation for different Implementation
     */
    public static void main(String args[]){
        //Coach theCoach = new BaseBallCoach();
        Coach theCoach = new TrackCoach();
        // Requirement can easily change the theCoach object for different games hockey, baseball, etc. App should be configurable.
        System.out.println(theCoach.getDailyWorkout());
    }
}
