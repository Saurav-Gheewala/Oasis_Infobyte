package com.oasis.ATM.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
public class AccountAndAmountModel {
    private String accountNumber;
    private Double amount;
}
