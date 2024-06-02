package com.oasis.ATM.model;

import lombok.*;

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MoneyTransferModel {
    private String fromAccountNumber;
    private String toAccountNumber;
    private Double amount;
}
