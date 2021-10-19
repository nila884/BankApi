package com.nila.BankApi.repository;


import com.nila.BankApi.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

	Optional<Account> findByAccountNumber(Long accountNumber);
}
