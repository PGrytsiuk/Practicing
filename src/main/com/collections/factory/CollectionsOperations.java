package main.com.collections.factory;

import main.com.collections.list.product.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsOperations {

    public static Product door = new Product("Wooden Door", 35);
    public static Product floorPanel = new Product("Floor Panel", 25);
    public static Product window = new Product("Glass Window", 10);

    public static void main(String[] args) {

        var products = new ArrayList<Product>();
        Collections.addAll(products, door, floorPanel, window);

        /*Collections.shuffle(products);*/
        Collections.fill(products, null);

        System.out.println("products = " + products);

       /* var products = List.of(door, floorPanel, window);

        Product lightestProduct = Collections.min(products, Product.BY_WEIGHT);
        Product heavyProduct = Collections.max(products, Product.BY_WEIGHT);

        System.out.println("lightestProduct = " + lightestProduct);
        System.out.println("heavyProduct = " + heavyProduct);*/
    }
}
