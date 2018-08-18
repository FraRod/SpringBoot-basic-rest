package com.frarod.rest.repository;


import com.frarod.rest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("product_repository")
public interface ProductRepository extends JpaRepository<Product, Serializable> {

    public abstract List<Product> findAll();
    public abstract Product findByBarcode(String barcode);
    public abstract Product findByIdAndBarcode(long id, String barcode);

}
