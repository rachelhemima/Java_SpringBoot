package com.jobiak.mvc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.jobiak.mvc.model.Customer;


@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>{

}
