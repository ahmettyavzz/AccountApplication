package com.example.folksdevspringboot.converter;

import com.example.folksdevspringboot.dto.CustomerAccountDto;
import com.example.folksdevspringboot.model.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CustomerAccountDtoConverter {

    private final TransactionDtoConverter converter;

    public CustomerAccountDto convert(Account account) {
        return new CustomerAccountDto(account.getId()
                , account.getBalance()
                , account.getCreationDate()
                , account.getTransactions().stream().map(converter::convert).collect(Collectors.toList()));
    }
}
