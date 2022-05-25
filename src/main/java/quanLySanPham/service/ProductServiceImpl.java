package quanLySanPham.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import quanLySanPham.model.Product;

public class ProductServiceImpl implements PruductService {
    List<Product> productList = new ArrayList();

    public ProductServiceImpl() {
        this.productList.add(new Product(1, "TIVI", 300));
        this.productList.add(new Product(2, "TULANH", 300));
        this.productList.add(new Product(3, "DIENTHOAI", 300));
    }

    public List<Product> findAll() {
        return this.productList;
    }

    public void save(Product product) {
        this.productList.add(product);
    }

    public int findIndexByid(int id) {
        int index = -1;

        for(int i = 0; i < this.productList.size(); ++i) {
            if (((Product)this.productList.get(i)).getId() == id) {
                index = i;
            }
        }

        return index;
    }

    public Product findByid(int id) {
        Iterator var2 = this.productList.iterator();

        Product product;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            product = (Product)var2.next();
        } while(product.getId() != id);

        return product;
    }

    public List<Product> finByName(String name) {
        return null;
    }

    public void update(int id, Product product) {
        int indexOf = this.findIndexByid(id);
        this.productList.set(indexOf, product);
    }

    public void delete(int id) {
        int intdexOf = this.findIndexByid(id);
        this.productList.remove(intdexOf);
    }
}
