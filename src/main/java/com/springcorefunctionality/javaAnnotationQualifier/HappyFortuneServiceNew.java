package com.springcorefunctionality.javaAnnotationQualifier;

import org.springframework.stereotype.Component;

@Component
class HappyFortuneServiceNew implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
