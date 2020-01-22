package comm.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.entity.Course;
import comm.example.entity.Instructor;
import comm.example.entity.InstructorDetail;

public class DeleteCourseDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
	Session session = factory.getCurrentSession();
		try {			
		session.beginTransaction();
			int theId = 10;
			Course tempCourse = session.get(Course.class, theId);
		System.out.println("Deleting course: " + tempCourse);
			session.delete(tempCourse);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			session.close();
			factory.close();
		}
	}

}





