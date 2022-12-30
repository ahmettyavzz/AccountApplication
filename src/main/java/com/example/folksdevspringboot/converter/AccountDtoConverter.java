package com.example.folksdevspringboot.converter;

import com.example.folksdevspringboot.dto.AccountDto;
import com.example.folksdevspringboot.model.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AccountDtoConverter {

    private final CustomerDtoConverter customerDtoConverter;
    private final TransactionDtoConverter transactionDtoConverter;

    public AccountDto convert(Account entity) {
        return new AccountDto(entity.getId()
                , entity.getBalance()
                , entity.getCreationDate()
                , customerDtoConverter.convertToAccountCustomer(entity.getCustomer())
                , entity.getTransaction().stream().map(transactionDtoConverter::convert).collect(Collectors.toSet()));
    }
}
