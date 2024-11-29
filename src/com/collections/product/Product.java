package com.collections.product;

import java.util.Comparator;

public class Product {
     private String name;
     private int weight;

    public Product(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return "Product{name='" + name + "', weight=" + weight + '}';
    }

    public static final Comparator<Product> BY_WEIGHT =
            Comparator.comparingInt(Product::getWeight);

   /* public static final Comparator<Product> BY_WEIGHT = new Comparator<Product>() {
        @Override
        public int compare(final Product o1, final Product o2) {
            return Integer.compare(o1.getWeight(), o2.getWeight());
        }
    } ;*/

}
