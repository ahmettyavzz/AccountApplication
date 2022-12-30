package com.example.folksdevspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;
@Data
@AllArgsConstructor
public class AccountDto {
    private String id;
    private Long balance;
    private LocalDateTime creationDate;
    private AccountCustomerDto customer;
    private Set<TransactionDto> transactions;
}
