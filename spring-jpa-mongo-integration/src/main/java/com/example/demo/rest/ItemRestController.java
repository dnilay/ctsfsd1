package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;

@RestController
@RequestMapping("/api")
public class ItemRestController {

	private ItemService itemService;

	@Autowired
	public ItemRestController( ItemService itemService) {
		super();
		this.itemService = itemService;	
	} 
	@PostMapping("/items")
	public Item createItem(@RequestBody Item item)
	{
		return itemService.createItem(item);
	}
	@GetMapping("/items")
	public List<Item> getAllItem()
	{
		return itemService.getAllItem();
	}
	@GetMapping("/items/{itemId}")
	public Optional<Item> getById(@PathVariable String itemId)
	{
		return itemService.getItemById(itemId);
	}
	
	
	
	
	
	
}
