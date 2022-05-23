package quanLySanPham.service;

import quanLySanPham.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements PruductService{
    List<Product> productList ;

    public ProductServiceImpl() {
        productList = new ArrayList<>();
        productList.add(new Product(1,"TIVI",300));
        productList.add(new Product(2,"TULANH",300));
        productList.add(new Product(3,"DIENTHOAI",300));

    }



    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public int findIndexByid(int id) {
        int index = -1;
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId()==id){
                index=i;
            }
        }
        return index;
    }

    @Override
    public Product findByid(int id) {
        for (Product product: productList
             ) {
            if(product.getId()== id) return product;
        }
        return null;
    }

    @Override
    public List<Product> finByName(String name) {
        return null;
    }

    @Override
    public void update(int id, Product product) {
        int indexOf = findIndexByid(id);
            productList.set(indexOf,product);

    }

    @Override
    public void delete(int id) {

    }
}
