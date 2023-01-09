package com.example.folksdevspringboot.service;

import com.example.folksdevspringboot.model.Account;
import com.example.folksdevspringboot.model.Transaction;
import com.example.folksdevspringboot.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private Logger logger = (Logger) LoggerFactory.getLogger(TransactionService.class);

    private final TransactionRepository transactionRepository;

    protected Transaction initiateMoney(final Account account, Long amount) {
        return transactionRepository.save(new Transaction(amount, account));
    }


}
