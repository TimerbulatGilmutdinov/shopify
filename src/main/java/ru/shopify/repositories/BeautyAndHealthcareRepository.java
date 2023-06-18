package ru.shopify.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shopify.models.Seller;
import ru.shopify.models.products.BeautyAndHealthcare;

@Repository
public interface BeautyAndHealthcareRepository extends JpaRepository<BeautyAndHealthcare, Integer> {
    Page<BeautyAndHealthcare> findAll(Pageable pageable, int page);
    Page<BeautyAndHealthcare> findAllBySeller(Pageable pageable, int page, Seller seller);
    Page<BeautyAndHealthcare> findAllByPriceGreaterThan(Double price, Pageable pageable, int page);
    Page<BeautyAndHealthcare> findAllByPriceLessThan(Double price, Pageable pageable, int page);

}
