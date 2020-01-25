package comm.example.spring.hibernate.demo;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.spring.hibernate.demo.entity.UserDetail;

public class App 
{
    public static void main( String[] args )
    {
        try {
        	ApplicationContext context=
        			new ClassPathXmlApplicationContext("applicationcontext.xml");
        	UserService service=context.getBean("service",UserService.class);
        	UserDetail detail=service.createUser(new UserDetail(UUID.randomUUID().toString(), "John", "john@luv2code.com"));
        	System.out.println(detail);
        }
			
		catch (Exception e) {
			e.printStackTrace();
		}
}
}
