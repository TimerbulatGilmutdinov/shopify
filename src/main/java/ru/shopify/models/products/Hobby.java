package ru.shopify.models.products;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hobby")
public class Hobby extends ProductDetails {
    public enum HobbyType {
        BOARD_GAMES,
        SEWING,
        DRAWING,
        MODELING,
        KNITTING,
        MUSICAL_INSTRUMENTS
    }
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Enumerated(EnumType.STRING)
    private HobbyType type;
}
