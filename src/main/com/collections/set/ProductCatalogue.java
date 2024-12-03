package main.com.collections.set;

import main.com.collections.list.product.Product;
import main.com.collections.set.supplier.Supplier;

import java.util.*;

public class ProductCatalogue implements Iterable<Product> {

    //private final List<Product> products = new ArrayList<>();
    private final Set<Product> products = new HashSet<>();

    public void addSupplier(final Supplier supplier) {
      /*  List<Product> supplierProducts = supplier.getProducts();
        supplierProducts.forEach(product -> {
            if(!products.contains(product)){
                products.add(product);
            }
        });*/
       products.addAll(supplier.getProducts());
    }
    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

}
