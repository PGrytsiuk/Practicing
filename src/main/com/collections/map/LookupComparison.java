package main.com.collections.map;

import main.com.collections.map.product.Product;

import java.util.*;

public class LookupComparison {

    private static final int ITERATIONS = 5;
    private static final int NUMBER_OF_PRODUCTS = 20_000;

    private static final List<Product> products = generateProducts();

    public static void main(String[] args) {

        runLookups(new MapProductLookupTable());
        runLookups(new NaiveProductLookupTable());
    }

    private static List<Product> generateProducts() {
        final List<Product> products = new ArrayList<>();
        final Random weightGenerator = new Random();
        for (int i = 0; i < NUMBER_OF_PRODUCTS; i++){
            products.add(new Product(i, "Product" + i, 10 + weightGenerator.nextInt(5)));
        }
        Collections.shuffle(products);
        Collections.shuffle(products);
        Collections.shuffle(products);
        return products;
    }

    private static void runLookups(final ProductLookupTable lookupTable) {
        final List<Product> products = LookupComparison.products;
        System.out.println("Running lookups with " + lookupTable.getClass().getSimpleName());

        for (int i = 0; i < ITERATIONS; i++) {
            final long startTime = System.currentTimeMillis();

            for (Product product : products) {
                lookupTable.addProduct(product);
            }

            for (Product product : products) {
                final Product result = lookupTable.lookupById(product.getId());
                if (result != product) {
                    throw new IllegalArgumentException("Lookup Table returned for " + product);
                }
            }

            lookupTable.clear();

            long elapsedTime = System.currentTimeMillis() - startTime;
            System.out.println("Iteration " + (i + 1) + " took " + elapsedTime + "ms.");
        }
    }
}
