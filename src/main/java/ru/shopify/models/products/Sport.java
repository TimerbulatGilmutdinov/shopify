package ru.shopify.models.products;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sport")
public class Sport extends ProductDetails{
    public enum SportType{
        CLOTHES,
        NUTRITION,
        WATER_SPORTS,
        TOURISM,
        BICYCLES
    }
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Enumerated(EnumType.STRING)
    private SportType type;
}
