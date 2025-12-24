package org.craftigen.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@Entity
@NoArgsConstructor
@Table(name = "customer")
public class Customer {
    @Id
    private String id;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String city;
}
