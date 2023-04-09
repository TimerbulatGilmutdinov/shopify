package ru.shopify.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private Integer code;
    @Column(nullable = false)
    private Double price;
    @Column
    private Double rating;
    @ManyToOne
    @JoinColumn(name = "seller_id",nullable = false)
    private Seller seller;
}
