package main.com.collections.factory;

import main.com.collections.list.product.Product;
import main.com.collections.list.shipment.Shipment;

import java.util.List;

public class ShipmentsBreaker {

    public static Product door = new Product("Wooden Door", 35);
    public static Product floorPanel = new Product("Floor Panel", 25);
    public static Product window = new Product("Glass Window", 10);

    public static void main(String[] args) {

        Shipment shipment = new Shipment();

        shipment.add(door);
        shipment.add(window);
        shipment.add(door);
        shipment.add(window);
        shipment.add(floorPanel);

        shipment.prepare();

        List<Product> lightVanProducts = shipment.getLightVanProducts();
        System.out.println("LightVanProducts= " + lightVanProducts);

        lightVanProducts.remove(window);

        System.out.println("shipment = " + shipment.getLightVanProducts());
        shipment.forEach(prod -> System.out.println(prod));
    }

}
