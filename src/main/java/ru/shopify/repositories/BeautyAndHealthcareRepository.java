package ru.shopify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shopify.models.products.BeautyAndHealthcare;

@Repository
public interface BeautyAndHealthcareRepository extends JpaRepository<BeautyAndHealthcare, Integer> {
}
