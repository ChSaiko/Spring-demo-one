package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService thefortuneService;
	
	public FortuneService getFortuneService() {
		return thefortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		thefortuneService = fortuneService;
	}
	
	public TrackCoach(FortuneService fortuneService) {
		thefortuneService = fortuneService;
	}

	public TrackCoach() {

	}

	@Override
	public String getDailyWorkout() {

		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {

		return "Just Do It " ;//+ thefortuneService.getFortune();
	}

	// here we define the Hooks in this class because the instance id="myCoach" is a
	// object of class TrackCoach in the XML file
	
	@Override
	public String toString() {
		return "TrackCoach [thefortuneService=" + thefortuneService + ", getFortuneService()=" + getFortuneService()
				+ ", getDailyWorkout()=" + getDailyWorkout() + ", getDailyFortune()=" + getDailyFortune() + "]";
	}

	// add an init-method
	public void doMyStartupStuff() {
		System.out.println("trackCoach:inside method doMyStartupStuff");
	}

	

	// add a destroy method
	public void doMyCleanMethod() {
		System.out.println("trackCoach:inside method doMyCleanMethod");
	}

}
