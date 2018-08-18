package com.frarod.rest.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "products")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "product_id", unique = true, nullable = false, updatable = false)
    private long id;

    @Column(name = "product_barcode", unique = true, nullable = false, updatable = false)
    private String barcode;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_quantity")
    private Integer quantity;

    @Column(name = "product_price")
    private Double price;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private Timestamp created_at;

    @UpdateTimestamp
    @Column(name = "update_at")
    private Timestamp update_at;

    public Product() {
    }

    public Product(long id, String barcode, String name, Integer quantity, Double price, Timestamp created_at, Timestamp update_at) {
        this.id = id;
        this.barcode = barcode;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.created_at = created_at;
        this.update_at = update_at;
    }
}
