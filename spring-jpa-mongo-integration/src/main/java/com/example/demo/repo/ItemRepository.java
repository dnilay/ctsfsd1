package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Item;
@Repository
public interface ItemRepository extends MongoRepository<Item, String>{

}
