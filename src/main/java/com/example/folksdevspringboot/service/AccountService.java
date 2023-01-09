package com.example.folksdevspringboot.service;

import com.example.folksdevspringboot.converter.AccountDtoConverter;
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
    private final AccountDtoConverter accountDtoConverter;


    public AccountDto createAccount(CreateAccountRequest createAccountRequest) {
        Customer customer = customerService.findCustomerById(createAccountRequest.getCustomerId());

        Account account = new Account(createAccountRequest.getInitialCredit()
                , LocalDateTime.now()
                , customer);

        if (createAccountRequest.getInitialCredit() > 0) {
            Transaction transaction = new Transaction(createAccountRequest.getInitialCredit(), account);
            account.getTransactions().add(transaction);
        }
        return accountDtoConverter.convert(accountRepository.save(account));
    }
}

