package br.com.softwalter.bankaccount.domain.entities.bank;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "savings_account")
public class SavingsAccount extends Account{

    private double interestRate;
}
