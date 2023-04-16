package ru.shopify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shopify.models.Seller;

@Repository
public interface SellersRepository extends JpaRepository<Seller, Integer> {
}
