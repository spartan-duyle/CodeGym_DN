package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void delete(int id);
    void update(int id, Product product);
    List<Product> findByName(String name);
}
