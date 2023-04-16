package ru.shopify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shopify.models.Account;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Account, Integer> {
    Optional<Account> findByEmail(String email);
}
