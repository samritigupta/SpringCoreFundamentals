package com.springcorefunctionality.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String args[]){
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        /*
        When we pass the interface to the method, behind the scenes Spring will cast the object for you.
        Behaves the same as getBean(String), but provides a measure of type safety by throwing a BeanNotOfRequiredTypeException
        if the bean is not of the required type.
         */
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
