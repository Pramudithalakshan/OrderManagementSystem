package org.craftigen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "supplier")
public class Supplier {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private String company;
    private String registeredDate;
}
