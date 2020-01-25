package comm.example.spring.hibernate.demo;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import comm.example.spring.hibernate.demo.entity.UserDetail;


@Repository("dao")
public class UserDAOImpl implements UserDAO {
	
	private SessionFactory sessionFactory;
	private Session session;
	
@Autowired
	public UserDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
		session = sessionFactory.openSession();
		
	}

	

	
	@Override
	public UserDetail createUser(UserDetail user) {
		session.save(user);

		return user;
	}

}
