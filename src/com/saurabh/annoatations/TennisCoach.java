package com.saurabh.annoatations;

import org.springframework.stereotype.Component;

@Component("tennis")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice Backhand";
	}

}
