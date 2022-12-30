package com.example.folksdevspringboot.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
public class Account {

    @javax.persistence.Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private Long balance;
    private LocalDateTime creationDate;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    private Set<Transaction> transaction;


}
