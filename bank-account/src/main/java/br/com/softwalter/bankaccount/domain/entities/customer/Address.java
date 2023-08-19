package br.com.softwalter.bankaccount.domain.entities.customer;

import br.com.softwalter.bankaccount.domain.entities.customer.Customer;
import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @OneToOne(mappedBy = "address")
    private Customer customer;

    // Constructors, getters, and setters

    // Other methods
}
