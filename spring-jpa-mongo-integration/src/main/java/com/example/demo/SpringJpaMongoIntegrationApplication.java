package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.demo.model.Address;
import com.example.demo.model.Hobby;
import com.example.demo.model.Person;
import com.example.demo.repo.PersonRepository;

@SpringBootApplication

//@EnableMongoRepositories(basePackageClasses = Person.class)
public class SpringJpaMongoIntegrationApplication implements CommandLineRunner {

	private PersonRepository personRepository;

	@Autowired
	public SpringJpaMongoIntegrationApplication(PersonRepository personRepo) {
		super();
		this.personRepository = personRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMongoIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Hobby> list=new ArrayList<Hobby>();
		list.add(new Hobby("Swimming"));
		list.add(new Hobby("TV"));

		personRepository.save(new Person("John", "Doe", new Address("Demo Addressline-1", "Demo Addressline-2", "India", "demo phonenumber1"), list));
				
	}

}
