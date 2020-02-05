package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.BookDAO;
import com.example.demo.entity.Book;
@Service
@EnableTransactionManagement
public class BookServiceImpl implements BookService {

	private BookDAO bookDAO;
	
	
	@Autowired
	
	public BookServiceImpl(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	@Override
	@Transactional
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDAO.findAll();
	}

	@Override
	@Transactional
	public Optional<Book>  getBookById(Integer bookId) {
		
		Optional<Book> book=bookDAO.findById(bookId);
		
		return book;
	}

}
