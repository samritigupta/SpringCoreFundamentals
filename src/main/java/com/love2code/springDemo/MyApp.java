package com.love2code.springDemo;

public class MyApp {
    // Inversion of Control (to give control of creation and management of object to someone else)
    /*
        My App --------> give me coach object ---> object Factory --->         configuration
                         <----------object-----    (Spring Container)           /     |    \
                                                                         baseball   hockey  Cricket Coach
                                                                         Coach       Coach


        SPRING CONTAINER HELPS
         - MY APP CONFIGURABLE
         - Easy change theCoach object to any sports.

         - configuration three ways:
         1. XML configuration file
         2. JAva annotations
         3. Java Source Code


         - Development process
         Step1. Configure your spring beans
                <beans -->
                    <bean id = "myCoach"  class ="com.luv2code.springDemo.BaseBallCoach">
                    </bean>
                </beans>
         Step2. Create a spring container  (Application Context)
                - ClassPathXMLApplicationContext
                    ClassPathXMLApplicationContext context = new ClassPathXMLApplicationContext("ApplicationContext.xml");
                - AnnotationConfigApplicationContext
                - GenericWebApplicationContext
         step3. Retrieve beans from spring container
                Coach theCoach = context.getBeans("myCoach",Coach.class);


         Spring Beans
         - default scope of bean is Singleton (scopes: singleton, prototype, request, session, global-session).
         - i.e. one instance is created
         - Cached in memory
         - all request for bean will return a shared reference of the same bean.
         - <bean scope="" >
         - For "prototype" scoped beans, Spring does not call the destroy method.
         - In contrast to the other scopes, Spring does not manage the complete lifecycle of a prototype bean:
         the container instantiates, configures, and otherwise assembles a prototype object, and
         hands it to the client, with no further record of that prototype instance.
         - Thus, although initialization lifecycle callback methods are called on all objects regardless of scope,
         in the case of prototypes, configured destruction lifecycle callbacks are not called.
         - Can destroy in case of prototype but custom code is required.


         Bean lifecycle
         container started  ---> bean instantiated --> dependency injected --> Internal spring processing ---
         --> your custom init method --->  bean is ready for use/ container shutdown  ---
         --> custom destroy method executed when app or lifecycle is over


         Custom initialisation code  <bean init-method="" >
         - calling custom buisness logic
         - setting up handles to resources (db, socket files, etc)

         custom destroy method <bean destroy-method="" >
         - calling custom buisness logic
         - clean up handles to resources (db, socket files, etc)

     */
    public static void main(String args[]){
        //Coach theCoach = new BaseBallCoach();
        Coach theCoach = new TrackCoach();
        // Requirement can easily change the theCoach object for different games hockey, baseball, etc. App should be configurable.
        System.out.println(theCoach.getDailyWorkout());
    }
}
