package ru.shopify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shopify.models.products.HouseholdAppliances;

@Repository
public interface HouseholdAppliancesRepository extends JpaRepository<HouseholdAppliances, Integer> {
}
