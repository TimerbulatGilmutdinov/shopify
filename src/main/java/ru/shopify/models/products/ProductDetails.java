package ru.shopify.models.products;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.shopify.models.Seller;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    @Column(unique = true)
    protected Integer code;
    @Column(nullable = false)
    protected Double price;
    @Column
    protected Double rating;
    @ManyToOne
    @JoinColumn(name = "seller_id")
    protected Seller seller;
    protected boolean isAvailable;
}
