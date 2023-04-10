package ru.shopify.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.shopify.models.products.ProductDetails;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String number;
    @Column
    private Double price;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @ElementCollection
    @CollectionTable(name="carts",
            indexes = { @Index(columnList = "product_index") },
            joinColumns = @JoinColumn(name = "order_id"))
    @Column(name = "product")
    private List<ProductDetails> products;
}
