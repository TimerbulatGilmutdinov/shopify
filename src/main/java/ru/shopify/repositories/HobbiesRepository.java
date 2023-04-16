package ru.shopify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shopify.models.products.Hobby;

@Repository
public interface HobbiesRepository extends JpaRepository<Hobby, Integer> {
}
