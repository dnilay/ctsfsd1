package crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;

import crm.mapper.Customermapper;
import crm.model.Customer;
import crm.model.CustomerDto;
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

	@Override
	public List<Customer> getAllCustomer() {
		Query query=entityManager.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}

	@Override
	public Customer findBuyId(int id) {
		entityManager.getTransaction().begin();
		Customer c=entityManager.find(Customer.class, id);
		entityManager.getTransaction().commit();
		return c;
		
		
	}

	@Override
	public void update(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.merge(customer);
		entityManager.getTransaction().commit();
		
	}

}
