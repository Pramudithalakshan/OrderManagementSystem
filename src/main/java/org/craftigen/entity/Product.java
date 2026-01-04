package org.craftigen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "product")
public class Product {
    @Id
    private String id;
    private String name;
    private Double price;
    private String added_date;
    private String expiry_date;
}
