package main.com.collections.map;

import main.com.collections.map.product.Product;
import main.com.collections.map.product.ProductFixtures;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ViewOverMaps {

    public static void main(String[] args) {

        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        Set<Integer> ids = idToProduct.keySet();
        System.out.println(ids);
        System.out.println(idToProduct);
        System.out.println();

        ids.remove(1);
        System.out.println(ids);
        System.out.println(idToProduct);

        Collection<Product> products = idToProduct.values();
        System.out.println(products);
        System.out.println(idToProduct);

        products.remove(ProductFixtures.window);

        System.out.println(products);
        System.out.println(idToProduct);

        Set<Map.Entry<Integer, Product>> entries = idToProduct.entrySet();
        for(Map.Entry<Integer, Product> entry : entries) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

            entry.setValue(ProductFixtures.window);
        }
        System.out.println(idToProduct);
    }
}
