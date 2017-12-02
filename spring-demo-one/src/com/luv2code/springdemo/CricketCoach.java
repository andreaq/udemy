package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	// add new field for emailAddress and team
	private String emailAddress;
	private String team;
	
	// create a no-arg constructor 
	public CricketCoach() {
		System.out.println("CricketCoach: inside the no-arg contructor");
	}
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside the setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
		
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside the setter method - setEmaiAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside the setter method - setTeam");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
