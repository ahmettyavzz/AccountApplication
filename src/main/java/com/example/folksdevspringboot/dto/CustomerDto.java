package com.example.folksdevspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CustomerDto {
    private String id;
    private String name;
    private String surname;
    private List<CustomerAccountDto> accounts;
}
