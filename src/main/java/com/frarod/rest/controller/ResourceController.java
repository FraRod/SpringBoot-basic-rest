package com.frarod.rest.controller;

import com.frarod.rest.entity.Product;
import com.frarod.rest.model.ProductModel;
import com.frarod.rest.service.Impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ResourceController {

    @Autowired
    @Qualifier("product_service")
    private ProductService productService;

    //Read All Data
    @GetMapping(value = "/products")
    public List<ProductModel> getAllProduct(){
        return productService.read();
    }

    //Read Product
    @GetMapping("/product/{barcode}")
    public ProductModel getProduct(@PathVariable("barcode") String barcode){
        return productService.getByBarcode(barcode);
    }

    //Insert Data
    @PostMapping(value = "/product")
    public boolean addProduct(@RequestBody @Valid Product product) {
        return productService.create(product);
    }

    //Update Data
    @PutMapping(value = "/product")
    public boolean updateProduct(@RequestBody @Valid Product product) {
        return productService.update(product);
    }

    //Delete Data
    @DeleteMapping("/product/{id}/{barcode}")
    public boolean deleteProduct(@PathVariable("id") long id, @PathVariable("barcode") String barcode) {
        return productService.delete(id, barcode);
    }
}
