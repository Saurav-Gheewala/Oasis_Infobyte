package com.oasis.ATM.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class JwtResponse {
    private String jwtToken;
    private String accountHolder;
}
