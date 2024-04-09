package com.kani.springboot.springdatajpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository 
             extends CrudRepository<Books,Integer>{

}
