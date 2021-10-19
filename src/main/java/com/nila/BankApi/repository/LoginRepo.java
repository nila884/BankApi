package com.nila.BankApi.repository;

import com.nila.BankApi.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login, Long> {
    Login findByEmail(String email);
}
