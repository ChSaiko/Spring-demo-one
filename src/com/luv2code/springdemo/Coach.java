package com.luv2code.springdemo;

public interface Coach {
	//the best practice is to create a interface to implement the other classes
	//because we like the couplage faible
	//like héritage but heritance not good because have many problems
	
	public String getDailyWorkout();

	public String getDailyFortune();
}
