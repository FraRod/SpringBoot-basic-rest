package com.frarod.rest.service.Impl;

import com.frarod.rest.converter.ProductConventer;
import com.frarod.rest.entity.Product;
import com.frarod.rest.model.ProductModel;
import com.frarod.rest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("product_service")
public class ProductService {

    @Autowired
    @Qualifier("product_repository")
    private ProductRepository productRepository;

    @Autowired
    @Qualifier("product_converter")
    private ProductConventer productConventer;


    public boolean create(Product product) {
        try {
            productRepository.save(product);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<ProductModel> read() {
        return productConventer.ProductConvert(productRepository.findAll());
    }

    public boolean update(Product product) {
        try {
            productRepository.save(product);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(long id, String barcode) {
        try {
            Product product = productRepository.findByIdAndBarcode(id, barcode);
            productRepository.delete(product);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ProductModel getByBarcode(String barcode) {
        return new ProductModel(productRepository.findByBarcode(barcode));
    }

}
