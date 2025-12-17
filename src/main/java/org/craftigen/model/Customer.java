package org.craftigen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String city;
    private String address;
}
