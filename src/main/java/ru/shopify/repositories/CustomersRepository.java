package ru.shopify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shopify.models.Customer;

@Repository
public interface CustomersRepository extends JpaRepository<Customer, Integer> {
}
