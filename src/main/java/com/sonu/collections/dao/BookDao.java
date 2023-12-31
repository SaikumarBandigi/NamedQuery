package com.sonu.collections.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sonu.collections.model.Book;

@Repository
public interface BookDao extends CrudRepository<Book, Integer> {

    public Iterable<Book> findByBookName(String bookName);

    //select * from book join publisher join book_publisher


    //Named Query Section
    public Iterable<Book> retireveByBookName(String bookName);


    Iterable<Book> retireveBookById(Integer bookId);


}
