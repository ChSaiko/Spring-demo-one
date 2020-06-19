package com.luv2code.springdemo;

public class BasebalCoach implements Coach {

	// define a private field for the dependency
	private FortuneService ThefortuneService;

	// define a constructor for dependency injection
	public BasebalCoach(FortuneService fortuneService) {
		ThefortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return ThefortuneService.getFortune();
	}
}
