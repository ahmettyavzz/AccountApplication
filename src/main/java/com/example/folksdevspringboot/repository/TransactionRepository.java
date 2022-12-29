package com.example.folksdevspringboot.repository;

import com.example.folksdevspringboot.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
