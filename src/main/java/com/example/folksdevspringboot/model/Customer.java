package com.example.folksdevspringboot.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
public class Customer {
    @javax.persistence.Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String name;
    private String surname;

    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    private Set<Account> accounts;

}
