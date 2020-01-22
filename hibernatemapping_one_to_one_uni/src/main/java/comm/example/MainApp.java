package comm.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.entity.Instructor;
import comm.example.entity.InstructorDetail;

public class MainApp {


	public static void main(String[] args) {
		try {
			
			SessionFactory factory=new Configuration()
					.configure().addAnnotatedClass(Instructor.class)
					.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
			Session session=factory.openSession();
			Instructor instructor=new Instructor("John", "Doe", "john@luv2code.com");
			instructor.setInstructorDetail(new InstructorDetail("https://www.youtube.com/john", "Guiter"));
			session.getTransaction().begin();
			session.save(instructor);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
