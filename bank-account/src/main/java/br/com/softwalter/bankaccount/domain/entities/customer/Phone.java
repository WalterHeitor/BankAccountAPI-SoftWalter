package br.com.softwalter.bankaccount.domain.entities.customer;

import br.com.softwalter.bankaccount.domain.entities.customer.Customer;
import jakarta.persistence.*;

@Entity
@Table(name = "phone")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private String number;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // Constructors, getters, and setters

    // Other methods
}
