package com.mycompany.spring_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_di.bean.Coach;

public class App 
{
    public static void main( String[] args )
    {
       try {
    	   ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	   Coach theCoach=context.getBean("theCoach",Coach.class);
    	   System.out.println(theCoach.getDailyWorkOut());
    	   System.out.println(theCoach.getDailyFortune());
		
	} catch (Exception e) {
		
	}
    }
}
