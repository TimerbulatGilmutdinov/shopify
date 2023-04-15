package ru.shopify.models.products;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "electronics")
public class Electronics extends ProductDetails{
    public enum ElectronicsType{
        SMARTPHONES,
        HEADPHONES,
        SMARTPHONE_ACCESSORIES,
        COMPUTERS,
        LAPTOPS,
        TABLETS,
        TV
    }
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Enumerated(EnumType.STRING)
    private ElectronicsType type;
}
