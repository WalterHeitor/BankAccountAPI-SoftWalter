package br.com.softwalter.bankaccount.domain.entities.bank;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "checking_account")
public class CheckingAccount extends Account{

    private double overdraftLimit;
}
