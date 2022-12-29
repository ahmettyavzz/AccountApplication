package com.example.folksdevspringboot.model;

import com.example.folksdevspringboot.model.type.TransactionType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Transaction {
    @javax.persistence.Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private TransactionType transactionType;
    private Long amount;
    private LocalDateTime transactionDate;

    @ManyToOne(fetch = FetchType.LAZY,optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id",nullable = false)
    private Account account;
}
