package br.com.softwalter.bankaccount.domain.entities.customer;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customer")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private List<Phone> phones;

    // Constructors, getters, and setters

    // Other methods
}
