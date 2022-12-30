package com.example.folksdevspringboot.dto;

import com.example.folksdevspringboot.model.type.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class TransactionDto {
    private String id;
    private TransactionType transactionType;
    private Long amount;
    private LocalDateTime transactionDate;
}
