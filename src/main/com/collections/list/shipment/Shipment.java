package main.com.collections.list.shipment;

import main.com.collections.list.product.Product;

import java.util.*;

public class Shipment implements  Iterable<Product> {

    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private static final int MISSING_PRODUCT = -1;

    private final List<Product> products = new ArrayList<>();
    private List<Product> lightVanProducts;
    private List<Product> heavyVanProducts;

    public void add(Product product) {
        products.add(product);
    }

    public boolean replace(Product oldProduct, Product newProduct) {
        int position =  products.indexOf(oldProduct);
        if(position == MISSING_PRODUCT) {
            return false;
        }else {
            products.set(position, newProduct);
            return  true;
        }
    }

    public void prepare() {
        //Sort the product list
        products.sort(Product.BY_WEIGHT);

        //find the Split point
        int splitPoint = findSplitPoint();

        //create two subviews of the list
        lightVanProducts = products.subList(0, splitPoint);
        heavyVanProducts = products.subList(splitPoint, products.size());
    }

    private int findSplitPoint() {
        int size = products.size();
        for (int i = 0; i < size; i++) {
           Product product =  products.get(i);
           if (product.getWeight() > LIGHT_VAN_MAX_WEIGHT) {
               return i;
           }
        }
        return 0;
    }

    public List<Product> getHeavyVanProducts() { return heavyVanProducts; }

    public List<Product> getLightVanProducts() { return lightVanProducts; }

    public Iterator<Product> iterator() { return  products.iterator(); }
}
