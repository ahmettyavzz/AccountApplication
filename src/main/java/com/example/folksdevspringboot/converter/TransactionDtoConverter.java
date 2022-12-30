package com.example.folksdevspringboot.converter;

import com.example.folksdevspringboot.dto.AccountCustomerDto;
import com.example.folksdevspringboot.dto.TransactionDto;
import com.example.folksdevspringboot.model.Customer;
import com.example.folksdevspringboot.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionDtoConverter {

    public TransactionDto convert(Transaction entity) {

        if (entity == null) {
            return new TransactionDto("", null, null,null);
        }
        return new TransactionDto(entity.getId()
                ,entity.getTransactionType()
                ,entity.getAmount()
                ,entity.getTransactionDate());
    }
}
