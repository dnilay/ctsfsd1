package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Item;
import com.example.demo.repo.ItemRepository;

@SpringBootApplication
public class SpringJpaMongoIntegrationApplication implements CommandLineRunner {
	private ItemRepository itemRepository;

	@Autowired
	public SpringJpaMongoIntegrationApplication(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMongoIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * itemRepository.save(new Item("Computer", 2000)); itemRepository.save(new
		 * Item("Mobile", 200)); List<Item> list=itemRepository.findAll();
		 * list.forEach(i->{ System.out.println(i); });
		 */
	}

}
