package ru.shopify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shopify.models.Order;

@Repository
public interface OrdersRepository extends JpaRepository<Order, Integer> {
}
