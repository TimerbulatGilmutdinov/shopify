package ru.shopify.models;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "sellers")
public class Seller extends Account{
    @Column
    private String name;
    @Column
    private Double rating;
}
