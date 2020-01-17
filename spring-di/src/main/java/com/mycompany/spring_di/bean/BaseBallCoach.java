package com.mycompany.spring_di.bean;

public class BaseBallCoach implements Coach {
	FortuneService fortuneService=null;
	

	public BaseBallCoach(com.mycompany.spring_di.bean.FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		
		return "practice backball volley today";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getDailyFortune();
	}

}
