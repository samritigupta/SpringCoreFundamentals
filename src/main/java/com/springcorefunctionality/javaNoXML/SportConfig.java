package com.springcorefunctionality.javaNoXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springcorefunctionality.javaNoXML")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // bean id will be method name
    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }

    @Bean
    public Coach swimCoach(){
        SwimCoach swimCoach = new SwimCoach(happyFortuneService());
        return swimCoach;
    }
}
/*
What is a real-time use case for @Bean?
Here is a real-time use case of using @Bean: You can use @Bean to make an existing third-party class available
to your Spring framework application context.
 */
