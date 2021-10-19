package com.nila.BankApi.repository;


import com.nila.BankApi.model.CustomerAccountXRef;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerAccountXRefRepository extends CrudRepository<CustomerAccountXRef, Long> {

}
