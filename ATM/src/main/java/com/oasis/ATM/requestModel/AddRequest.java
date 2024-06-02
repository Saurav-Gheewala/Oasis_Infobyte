package com.oasis.ATM.requestModel;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AddRequest {

    public String name;
    public String type;
    public Long phoneNumber;
    public String pin;
}
