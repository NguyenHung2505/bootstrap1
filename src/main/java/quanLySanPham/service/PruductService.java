package quanLySanPham.service;

import quanLySanPham.model.Product;

import java.util.List;

public interface PruductService {
    List<Product> findAll ();
    void save (Product product);

    int findIndexByid(int id);

    Product findByid(int id);

    List<Product> finByName(String name);

    void update(int id , Product product);

    void delete(int id);
}
