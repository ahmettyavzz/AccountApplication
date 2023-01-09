package com.example.folksdevspringboot.converter;

import com.example.folksdevspringboot.dto.AccountCustomerDto;
import com.example.folksdevspringboot.dto.CustomerDto;
import com.example.folksdevspringboot.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CustomerDtoConverter {

    private final CustomerAccountDtoConverter converter;

    public AccountCustomerDto convertToAccountCustomer(Customer entity) {

        if (entity == null) {
            return new AccountCustomerDto("", "", "");
        }
        return new AccountCustomerDto(entity.getId(), entity.getName(), entity.getSurname());
    }

    public CustomerDto convertToCustomerDto(Customer customer) {
        return new CustomerDto(customer.getId()
                , customer.getName()
                , customer.getSurname()
                , customer.getAccounts().stream().map(converter::convert).collect(Collectors.toList()));


    }
}
