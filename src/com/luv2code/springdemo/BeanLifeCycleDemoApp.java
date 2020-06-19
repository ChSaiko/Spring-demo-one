package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");

		// we define our init and destroy methods in the class witch have id
		// instance(id="myCoach" because our getBean("myCoach,Coach.class)) and the
		// instance who have this id it's configured in
		// XML file (beanLifeCycle-applicationContext.xml) who is instance of class TrackCoach

		// in general the bean witch would add the Hooks(lifeCycle methods) we should
		// add the hooks inside the bean selected

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.toString());
		// close the context
		context.close();
	}

}
