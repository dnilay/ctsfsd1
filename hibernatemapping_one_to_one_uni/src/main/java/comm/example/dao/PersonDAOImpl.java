package comm.example.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import comm.example.entity.Person;
import comm.example.util.HibernateUtil;

public class PersonDAOImpl implements PersonDAO {
	private Session session;
	private Transaction transaction;
	private BufferedReader br;
	{
		session=HibernateUtil.getSession();
		transaction=session.getTransaction();
		br=new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public Person createPerson(Person person) {
		try {
			transaction.begin();
			session.save(person);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return person;
	}

	@Override
	public List<Person> getAllPersons() {
		Query query=session.createQuery("from Person");
		return query.list();
	}

	@Override
	public Person getPersonByid(Integer id) {
		
		Person person=session.get(Person.class, id);
		if(person==null)
		{
			System.out.println("not found");
		}
		return person;
	}

	@Override
	public Person updatePerson(Integer id) throws IOException {
		Person p=session.get(Person.class, id);
		if(p!=null)
		{
			System.out.println("Name: ");
			String name=br.readLine();
			p.setCName(name);
			p.setDateOfBirth(LocalDate.now());
			transaction.begin();
			session.update(p);
			transaction.commit();
		}
		else {
			System.out.println("not found");
		}
		return p;
	}

	@Override
	public void deletePerson(Integer id) {
		Person p=session.get(Person.class, id);
		if(p!=null)
		{
			transaction.begin();
			session.delete(p);
			transaction.commit();
			System.out.println("deleted.");
		}
		else
		{
			System.out.println("not found");
		}

	}

}
