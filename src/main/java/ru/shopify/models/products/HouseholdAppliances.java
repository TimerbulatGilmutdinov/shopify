package ru.shopify.models.products;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "household_appliances")
public class HouseholdAppliances extends ProductDetails {
    public enum HouseholdAppliancesType {
        KITCHEN,
        CLIMATIC,
        BUILT_IN,
        SMART_HOUSE,
        BIG
    }
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Enumerated(EnumType.STRING)
    private HouseholdAppliancesType type;
}
