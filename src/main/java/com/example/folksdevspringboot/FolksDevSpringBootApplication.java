package com.example.folksdevspringboot;

import com.example.folksdevspringboot.model.Customer;
import com.example.folksdevspringboot.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class FolksDevSpringBootApplication implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public FolksDevSpringBootApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(FolksDevSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args){
        Customer customer = customerRepository.save(new Customer("", "ahmet", "yavuz", new ArrayList<>()));
        System.out.println(customer);
    }
}
