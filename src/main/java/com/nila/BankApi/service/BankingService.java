package com.nila.BankApi.service;


import com.nila.BankApi.domain.AccountInformation;
import com.nila.BankApi.domain.CustomerDetails;
import com.nila.BankApi.domain.TransactionDetails;
import com.nila.BankApi.domain.TransferDetails;
import com.nila.BankApi.model.Login;
import com.nila.BankApi.model.Role;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BankingService {

    public List<CustomerDetails> findAll();
    
    public ResponseEntity<Object> addCustomer(CustomerDetails customerDetails);
    
    public CustomerDetails findByCustomerNumber(Long customerNumber);
    
    public ResponseEntity<Object> updateCustomer(CustomerDetails customerDetails, Long customerNumber);
    
    public ResponseEntity<Object> deleteCustomer(Long customerNumber) ;
    
    public ResponseEntity<Object> findByAccountNumber(Long accountNumber);
    
    public ResponseEntity<Object> addNewAccount(AccountInformation accountInformation, Long customerNumber);
    
    public ResponseEntity<Object> transferDetails(TransferDetails transferDetails, Long customerNumber);
    
    public List<TransactionDetails> findTransactionsByAccountNumber(Long accountNumber);

    public Login saveUser(Login user);
    public Role saveRole(Role role);
    public void addRoleToUser(String email, String roleName);
    public Login getUser(String email);
    public List<Login>getUsers();

}
