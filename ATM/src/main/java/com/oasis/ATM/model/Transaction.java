package com.oasis.ATM.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Data
@Getter
@Setter
@ToString

public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private double amount;
    private LocalDateTime timestamp;
    private String accountNumber;
    private Double clearBalance;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
