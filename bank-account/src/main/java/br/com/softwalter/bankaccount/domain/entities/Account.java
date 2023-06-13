package br.com.softwalter.bankaccount.domain.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "account")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "active")
    private Boolean active;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // Constructors, getters, and setters

    // Other methods
}
