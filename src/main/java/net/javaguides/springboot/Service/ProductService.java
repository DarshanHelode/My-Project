package net.javaguides.springboot.Service;

import net.javaguides.springboot.Entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
