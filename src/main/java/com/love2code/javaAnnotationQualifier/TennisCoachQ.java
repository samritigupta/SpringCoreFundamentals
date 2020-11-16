package com.love2code.javaAnnotationQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*
	Beans Scope in JAVA annotation
	- for init and destroy write your method and use @PostConstruct and @PreDestroy
	- Access modifier: The method can have any access modifier (public, protected, private)
	- Return type: The method can have any return type. However, "void' is most commonly used.
	          If you give a return type just note that you will not be able to capture the return value.
	          As a result, "void" is commonly used.
	- Method name: The method can have any method name.
	- Arguments: The method can not accept any arguments. The method should be no-arg.
*/

// Spring will automatically register it with default bean id.
// default scope is singleton can make it other by using @Scope
// @Scope("Singleton") / @Scope("prototype")
@Component
class TennisCoachQ implements Coach {

	// Which implementation to pick?? random or Happy?? --> sol. use Qualifier. otherwise NoUniqueBeanException will come.
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;

	public TennisCoachQ(){
		System.out.println("Inside default Constructor Tennis Coach");
	}

	/*
	@Qualifier is a nice feature, but it is tricky when used with Constructors.
    You have to place the @Qualifier annotation inside of the constructor arguments.

    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
        fortuneService = theFortuneService;
    }
	 */

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley " + email;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@PostConstruct
	public void init(){
		System.out.println("bean init");
	}

	@PreDestroy
	public void destroy(){
		System.out.println("bean destroy");
	}
}
