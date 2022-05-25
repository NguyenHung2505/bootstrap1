package quanLySanPham.service;

import java.util.List;
import quanLySanPham.model.Product;

public interface PruductService {
    List<Product> findAll();

    void save(Product var1);

    int findIndexByid(int var1);

    Product findByid(int var1);

    List<Product> finByName(String var1);

    void update(int var1, Product var2);

    void delete(int var1);
}
