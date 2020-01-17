package com.mycompany.spring_di.bean;

public class LuckyFortune implements FortuneService {

	@Override
	public String getDailyFortune() {
		
		return "today is your lucky day";
	}

}
