package main.com.collections.streams;

import main.com.collections.list.product.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class StreamProducts {

    public static void main(String[] args) {

        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        List<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        products.add(floorPanel);
        products.add(window);

        namesOfLightProductsWeightSortedStreams(products);
    /*    namesOfLightProductsWeightSortedLoop(products);*/
    }

    private static void namesOfLightProductsWeightSortedStreams(final List<Product> products) {
        products
                .stream()
                .filter(product -> product.getWeight() < 30)
                .sorted(comparingInt(Product::getWeight))
                .map(Product::getName)
                .forEach(System.out::println);
    }

    private static void namesOfLightProductsWeightSortedLoop(List<Product> products) {

        List<Product> lightProducts = new ArrayList<>();

        for(Product product : products){
            if(product.getWeight() < 30) {
                lightProducts.add(product);
            }
        }

        lightProducts.sort(comparingInt(Product::getWeight));

        for(Product product : lightProducts){
            System.out.println(product.getName());
        }
    }
}
