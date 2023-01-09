package com.example.folksdevspringboot.service;

import com.example.folksdevspringboot.exception.NotFoundException;
import com.example.folksdevspringboot.model.Customer;
import com.example.folksdevspringboot.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    protected Customer findCustomerById(String id) {
        return customerRepository.findById(id).orElseThrow(() -> new NotFoundException("Customer could not find by id: " + id));
    }


}
