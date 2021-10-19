package com.nila.BankApi.repository;


import com.nila.BankApi.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    public Optional<Customer> findByCustomerNumber(Long customerNumber);
    
}
