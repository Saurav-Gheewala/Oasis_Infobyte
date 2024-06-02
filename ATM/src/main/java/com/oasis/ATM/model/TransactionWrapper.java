package com.oasis.ATM.model;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class TransactionWrapper {
    private String type;
    private double amount;
    private LocalDateTime timestamp;
    private String accountNumber;
    private Double clearBalance;
}
