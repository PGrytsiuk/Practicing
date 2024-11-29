package main.com.collections.map;

import main.com.collections.map.product.Product;

public interface ProductLookupTable {

    void addProduct(Product productToAdd);

    Product lookupById(int id);

    void clear();
}
