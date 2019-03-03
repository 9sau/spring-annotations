package com.saurabh.annoatations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("tennis", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();
	}

}
