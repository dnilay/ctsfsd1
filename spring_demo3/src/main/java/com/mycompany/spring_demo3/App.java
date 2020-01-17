package com.mycompany.spring_demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        try {
        	ClassPathXmlApplicationContext context=
        			new ClassPathXmlApplicationContext("applicationContext.xml");
        	TennisCoach theCoach=context.getBean("theCoach",TennisCoach.class);
        	System.out.println(theCoach.getDailyWorkout()+
        			"\n"+theCoach.getDailyFortune()+"\nAge: "+theCoach.getAge()+"\nEmail: "+theCoach.getEmail());
        	theCoach=null;
			context.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
