package com.frarod.rest.converter;

import com.frarod.rest.entity.Product;
import com.frarod.rest.model.ProductModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("product_converter")
public class ProductConventer {

    public List<ProductModel> ProductConvert(List<Product> products) {
        List<ProductModel> productModelsConvert = new ArrayList<>();
        for (Product product : products) {
            productModelsConvert.add(new ProductModel(product));
        }
        return productModelsConvert;
    }

}
