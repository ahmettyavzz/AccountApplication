package com.example.folksdevspringboot.service;

import com.example.folksdevspringboot.dto.AccountDto;
import com.example.folksdevspringboot.dto.CreateAccountRequest;
import com.example.folksdevspringboot.model.Account;
import com.example.folksdevspringboot.model.Customer;
import com.example.folksdevspringboot.model.Transaction;
import com.example.folksdevspringboot.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    private final CustomerService customerService;
    private final TransactionService transactionService;

    public AccountDto createAccount(CreateAccountRequest createAccountRequest) {
        Customer customer = customerService.findCustomerById(createAccountRequest.getCustomerId());

        Account account= new Account(createAccountRequest.getInitialCredit()
                ,LocalDateTime.now()
                ,customer);

        if (createAccountRequest.getInitialCredit() >0){
            Transaction transaction=transactionService.initiateMoney(account, createAccountRequest.getInitialCredit());
            account.getTransaction().add(transaction);
        }
        return null;
    }
}

