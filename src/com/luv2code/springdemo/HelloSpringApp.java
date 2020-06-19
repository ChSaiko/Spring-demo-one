package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file==create a spring container

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("mycoach", Coach.class);

		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		// let's call our new method for fortune
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();
	}

}
