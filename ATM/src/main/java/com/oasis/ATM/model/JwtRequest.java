package com.oasis.ATM.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class JwtRequest {
    private String accountNumber;
    private String pin;
}
