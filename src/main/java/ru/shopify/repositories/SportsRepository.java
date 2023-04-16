package ru.shopify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shopify.models.products.Sport;

@Repository
public interface SportsRepository extends JpaRepository<Sport, Integer> {
}
