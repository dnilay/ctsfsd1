package com.mycompany.spring_demo3;

public class TennisCoach implements Coach {
	private String email;
	private int age;

	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = theFortuneService;
	}

	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

}
