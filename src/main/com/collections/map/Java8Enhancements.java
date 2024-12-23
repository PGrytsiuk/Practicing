package main.com.collections.map;

import main.com.collections.map.product.Product;
import main.com.collections.map.product.ProductFixtures;

import java.util.HashMap;
import java.util.Map;

public class Java8Enhancements {

    public static void main(String[] args) {


        Product defaultProd = new Product(-1, "Whatever the customer wants", 100);

        Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        idToProduct.forEach((id, prod) ->{
            System.out.println(prod.getName() + " has an id of " + id);
        });

     /*   idToProduct.replaceAll((id, prod) ->
                new Product(id, prod.getName(), prod.getWeight() + 10));

        System.out.println(idToProduct);*/

       /* Product product = idToProduct.computeIfAbsent(4, id -> new Product(id, "Door Handle", 5));
        System.out.println(product);
        System.out.println(idToProduct.get(4));*/

       /* Product product = idToProduct.getOrDefault(4, defaultProd);
        System.out.println(product);
        System.out.println(idToProduct.get(4));

        Product oldValue = idToProduct.replace(1, new Product(1, "Big door", 50));
        System.out.println(oldValue);
        System.out.println(idToProduct.get(1));*/
    }

}
