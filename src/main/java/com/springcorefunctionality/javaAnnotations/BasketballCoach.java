package com.springcorefunctionality.javaAnnotations;

import org.springframework.stereotype.Component;

/*
Instead of giving bean id, we can use default bean id given by spring.
Classname with first letter lower case i.e. basketballCoach.

Special Case: However, for the special case of when BOTH the first and second characters of the class name are upper case,
then the name is NOT converted. For the case of RESTFortuneService
RESTFortuneService --> RESTFortuneService
 */
@Component
public class BasketballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "run 15miles.";
    }
}
