package com.kani.springboot.springdatajpa;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController { 	
	@Autowired
	BooksService booksService;
	//http://localhost:9091/addbook
	/*
	 {"bookid":    "100",
     "bookname":  "CoreJAVA",
     "author"  :  "Oracle Crop",
     "price"   :  "450"
    }     	 */
	@PostMapping("/addbook")
	public int addBook(@RequestBody Books books) {
		booksService.addBook(books);		
		return books.getBookid();
		
		//REnity  will take by returen type  
		// Empdata , http stats codes , header 
	}
	//http://localhost:9091/allbooks
	@GetMapping("/allbooks")
	public List getAllBooks() {
		
		return booksService.getAllBooks();
	} 
	
	//http://localhost:9091/bookid/100
	//GetMapping : Book by ID            100
	@GetMapping("/bookid/{bookid}")
	public Books getBookById(@PathVariable("bookid")int bookid) {
		
		return booksService.getBookById(bookid);
	}
	//http://localhost:9091/bookid/100
	//Delete Record :
	
	
	
	
	@DeleteMapping("/bookid/{bookid}")
	public void deleteBook(@PathVariable("bookid")int bookid) {
		
		booksService.deleteBook(bookid);		
	}
	//http://localhost:9091/updatebook
	/*{
	     "bookid":    "100",
	     "bookname":  "JAVA",
	     "author"  :  "Oracle Crop",
	     "price"   :  "950"
	    } */
	//Update :(PUT) 	 
	@PutMapping("/updatebook")
	public Books update(@RequestBody Books books) {
		booksService.update(books); 
		return books; 	}

	@GetMapping("/hello")
	public String hello()
	{
		return "welcome";
	}
	
	
}
