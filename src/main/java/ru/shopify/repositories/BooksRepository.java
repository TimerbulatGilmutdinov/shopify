package ru.shopify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shopify.models.products.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
}
