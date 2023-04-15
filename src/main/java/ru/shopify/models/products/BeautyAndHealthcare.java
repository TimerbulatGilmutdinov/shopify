package ru.shopify.models.products;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "beauty_and_healthcare")
public class BeautyAndHealthcare extends ProductDetails {
    public enum HealthCareType{
        CARE,
        BEAUTY_EQUIPMENT,
        PHARMACY
    }
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private HealthCareType type;
}
