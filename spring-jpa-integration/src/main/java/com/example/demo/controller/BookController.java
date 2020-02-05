package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.error.BookNotFoundException;
import com.example.demo.error.ErrorMessage;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError1(BookNotFoundException bne)
	{
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage(bne.getMessage());
		errorMessage.setStatus(HttpStatus.NOT_FOUND.value());
		errorMessage.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError2(Exception e)
	{
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage(e.getMessage());
		errorMessage.setStatus(HttpStatus.BAD_REQUEST.value());
		errorMessage.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/books")
	public List<Book> getAll()
	{
		return bookService.getAllBooks();
	}
	@GetMapping("/books/{bookId}")
	public Optional<Book> getBookById(@PathVariable Integer bookId) throws Exception
	{
		Optional<Book> book=bookService.getBookById(bookId);
		if(!book.isPresent())
		{
			throw new BookNotFoundException("book not found with id: "+bookId);
		}
		
		return book; 
	}
	
}
