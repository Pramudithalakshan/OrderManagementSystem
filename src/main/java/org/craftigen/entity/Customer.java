package org.craftigen.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Document(collection = "customer")
public class Customer {
    @Id
    private String id;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String city;
}
