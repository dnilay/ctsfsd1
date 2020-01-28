package crm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;

import crm.model.Customer;
import crm.util.CustomerUtil;

public class CustomerDAOImpl implements CustomerDAO{
	private Session session;
	private EntityManager entityManager;
	
	{
		session=CustomerUtil.getMySessionFactory().openSession();
		session.getTransaction().begin();
		entityManager=session.
				getEntityManagerFactory().createEntityManager();
		session.getTransaction().commit();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		return customer;
	}

}
