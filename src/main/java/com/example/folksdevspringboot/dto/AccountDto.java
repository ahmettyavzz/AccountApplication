package com.example.folksdevspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class AccountDto {
    private String id;
    private Long balance;
    private LocalDateTime creationDate;
    private AccountCustomerDto customer;
    private List<TransactionDto> transactions;
}
