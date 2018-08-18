package com.frarod.rest.model;

import com.frarod.rest.entity.Product;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class ProductModel {

    private long id;

    private String barcode;

    private String name;

    private Integer quantity;

    private Double price;

    private Timestamp created_at;

    private Timestamp update_at;

    public ProductModel() {

    }

    public ProductModel(Product product) {
        this.id = product.getId();
        this.barcode = product.getBarcode();
        this.name = product.getName();
        this.quantity = product.getQuantity();
        this.price = product.getPrice();
        this.created_at = product.getCreated_at();
        this.update_at = product.getUpdate_at();
    }

    public ProductModel(long id, String barcode, String name, Integer quantity, Double price, Timestamp created_at, Timestamp update_at) {
        this.id = id;
        this.barcode = barcode;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.created_at = created_at;
        this.update_at = update_at;
    }
}
