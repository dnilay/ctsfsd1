package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Item;
import com.example.demo.repo.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemRepository itemRepository;

	

	@Override
	
	public List<Item> getAllItem() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Override

	public Item createItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.insert(item);
	}

	@Override
	public Optional<Item> getItemById(String itemid) {
		// TODO Auto-generated method stub
		return itemRepository.findById(itemid);
	}

}
