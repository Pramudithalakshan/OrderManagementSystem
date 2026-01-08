package org.craftigen.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SupplierDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private String company;
    private String registeredDate;
}
