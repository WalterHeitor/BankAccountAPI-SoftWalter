package br.com.softwalter.bankaccount.domain.entities.customer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "legal_person ")
public class LegalPerson  extends Customer {

    @Column(name = "cnpj")
    private String cnpj;

    // Constructors, getters, and setters

    // Other methods
}
