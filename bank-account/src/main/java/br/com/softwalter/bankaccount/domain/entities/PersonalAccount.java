package br.com.softwalter.bankaccount.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "personal_account")
public class PersonalAccount extends Account {

    @Column(name = "cpf")
    private String cpf;

    // Constructors, getters, and setters

    // Other methods
}
