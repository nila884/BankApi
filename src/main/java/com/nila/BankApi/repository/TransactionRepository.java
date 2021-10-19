package com.nila.BankApi.repository;


import com.nila.BankApi.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    public Optional<List<Transaction>> findByAccountNumber(Long accountNumber);
    
}
