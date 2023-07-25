package com.nareshit.collections.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.collections.model.Publisher;

@Repository
public interface PublisherDao  extends CrudRepository<Publisher, Integer>{

}
