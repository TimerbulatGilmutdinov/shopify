package ru.shopify.models.products;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Books extends ProductDetails {
    public enum BookType{
        ARTISTIC,
        NON_FICTION,
        CHILDREN
    }
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Enumerated(EnumType.STRING)
    private BookType type;
}
