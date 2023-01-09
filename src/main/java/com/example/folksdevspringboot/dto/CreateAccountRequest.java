package com.example.folksdevspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateAccountRequest {
    private String customerId;
    private Long initialCredit;
}
