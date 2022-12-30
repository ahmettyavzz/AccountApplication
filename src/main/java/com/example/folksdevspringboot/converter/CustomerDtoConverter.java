package com.example.folksdevspringboot.converter;

import com.example.folksdevspringboot.dto.AccountCustomerDto;
import com.example.folksdevspringboot.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {

    public AccountCustomerDto convertToAccountCustomer(Customer entity) {

        if (entity == null) {
            return new AccountCustomerDto("", "", "");
        }
        return new AccountCustomerDto(entity.getId(), entity.getName(), entity.getSurname());
    }
}
