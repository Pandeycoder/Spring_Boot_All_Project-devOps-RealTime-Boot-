package com.pandey.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pandey.binding.Book;

@RestController
public class BookRestCotnroller {
	
	
//	@GetMapping("/book/{id}") //path parameter
//	public Book getBook(@PathVariable("id") Integer id)
//	{
//		
//		Book book=new Book(id,"java",2500.23);
//	
//		return book;
//	}
	
	
	@GetMapping(value="/book/{id}", produces="application/json")
	public ResponseEntity<Book> getBook(@PathVariable("id") Integer id)
	{
		Book b= new Book(id,"java",200.00);
		
//		return new ResponseEntity<>(b,HttpStatus.SERVICE_UNAVAILABLE);
		return new ResponseEntity<>(b,HttpStatus.ACCEPTED);
		
	}

	
	@GetMapping(value="/books" , produces="application/json")
	public ResponseEntity<List<Book>> getBooks(){
		
		Book b1=new Book(501,"java",2300.23);
		Book b2=new Book(502,"python",200.00);
		Book b3=new Book(501,"Devops",2300.00);
		
		List<Book> books= Arrays.asList(b1,b2,b3);
	  
		return new ResponseEntity<>(books,HttpStatus.BAD_GATEWAY);
	}
	
	@PostMapping(value="/book", consumes="application/json",produces="text/plain")
	public ResponseEntity<String> saveBook(@RequestBody Book book)
	{
		
		System.out.println(book);
		
		//ToDO save Db
	
		return new ResponseEntity<>("Book Save",HttpStatus.CREATED);
		
		
	}
	
	@PutMapping(value="/book/{id}",consumes="application/json", produces="application/json")
	public ResponseEntity<Book> updateBook(@PathVariable("id") Integer id,@RequestBody Book book)
	{
		System.out.println(book);
		
		//ToDo : Update book in Db
		
		return new ResponseEntity<>(book,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/book/{id}",produces="text/plain")
	public ResponseEntity<String> deleteBook(@PathVariable("id") Integer id)
	{
		System.out.println("id delete record :: " + id);
		
		//ToDo : Delete book in DB
		
		return new ResponseEntity<>("Record deleted",HttpStatus.OK);
	}

}
