package ru.shopify.models.products;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clothes")
public class Clothes extends ProductDetails{
    public enum ClothesType{
        WOMEN,
        MEN,
        CHILDREN,
        ACCESSORIES,
        JEWELRY,
        BAGGAGE
    }
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Enumerated(EnumType.STRING)
    private ClothesType type;
}
