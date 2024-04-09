package com.kani.springboot.springdatajpa;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
	//BooksRepository booksRepository=new BooksRepository();
	@Autowired
	BooksRepository booksRepository;
	// 100   Oracle Crop   CoreJAVA 450
	public void addBook(Books books) {
		 booksRepository.save(books);
	}
		
	//get all books from database through  SpringDataJPA
	public List<Books> getAllBooks(){
		
		List<Books> booksList=new ArrayList<Books>();
		
		booksRepository.findAll().forEach(g1 ->booksList.add(g1));
		return booksList; 		
	} 
	
	//Retrive the record form databas using  find by bookid
	                        //  100
	public Books getBookById(int id) {
		return booksRepository.findById(id).get();
	}
	//Delete a record into database 
	public void deleteBook(int id) {
		booksRepository.deleteById(id);
	}
	// Upate a record
	
	public void update(Books books) {
		booksRepository.save(books);
	}

}

