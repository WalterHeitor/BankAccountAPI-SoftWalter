package br.com.softwalter.bankaccount.domain.entities.customer;

import br.com.softwalter.bankaccount.domain.entities.bank.Account;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "individual_person ")
public class IndividualPerson  extends Customer {

    @Column(name = "cpf")
    private String cpf;

    // Constructors, getters, and setters

    // Other methods
}
