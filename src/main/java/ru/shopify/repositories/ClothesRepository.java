package ru.shopify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shopify.models.products.Clothes;

@Repository
public interface ClothesRepository extends JpaRepository<Clothes, Integer> {
}
