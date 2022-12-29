package com.example.folksdevspringboot.repository;

import com.example.folksdevspringboot.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
