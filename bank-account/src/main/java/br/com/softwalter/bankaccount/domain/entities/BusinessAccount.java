package br.com.softwalter.bankaccount.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "business_account")
public class BusinessAccount extends Account {

    @Column(name = "cnpj")
    private String cnpj;

    // Constructors, getters, and setters

    // Other methods
}
