package com.oasis.ATM.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.util.Collection;
import java.util.List;

@Entity
@Data
@Getter
@Setter
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String accountNumber;
    private String accountType;
    private String accountHolder;
    private Double balance;
    private Long phoneNumber;
    private String pin;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

}
