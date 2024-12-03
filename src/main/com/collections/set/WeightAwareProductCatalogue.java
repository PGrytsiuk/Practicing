package main.com.collections.set;

import main.com.collections.list.product.Product;
import main.com.collections.set.supplier.Supplier;

import java.util.*;

public class WeightAwareProductCatalogue implements Iterable<Product> {

    private final NavigableSet<Product> products = new TreeSet<>(Product.BY_WEIGHT);

    public void addSupplier(final Supplier supplier) {
        products.addAll(supplier.getProducts());
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public Set<Product> findLighterProducts(final Product product) {
        return products.headSet(product, false);
    }
}
