package ru.shopify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shopify.models.products.Electronics;

@Repository
public interface ElectronicsRepository extends JpaRepository<Electronics, Integer> {
}
