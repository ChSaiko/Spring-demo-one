package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	// add a new fields and we also configured in the Application.xml
	// also we have other method to dependence injection we create a file.properties
	// and define the value of our fields the we inject them in the
	// context.xml(${foo.email}
	private String emailAdress;
	private String team;

	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach:inside no-arg constructor");
	}

	// our setter method for DI
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach:inside setter method - setEmailAdress");
		this.emailAdress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach:inside setter method - setTeam");

		this.team = team;
	}

	// here there is the methods 's implements from the Coach interface
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	/*
	 * for get this service how is not override in this class we should Do the DI by
	 * constructor or the setter method and don't forget the configuration at the
	 * application.XML
	 */	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
