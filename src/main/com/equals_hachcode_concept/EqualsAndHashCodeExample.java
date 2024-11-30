package main.com.equals_hachcode_concept;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashCodeExample {

    public static void main(String[] args) {

        System.out.println(new Book(1, "Joan Rolling").equals(new Book(1, "Joan Rolling")));
        System.out.println(new Book(2, "Vasyl Stus").equals(new Book(2, "Panas Myrnyi")));
        System.out.println(new Book(23, "Lesya Ukrainka").equals(new Object()));
        Book overridenBook = new Book(12, "Pavlo"){
            @Override
            public int hashCode() {
                return (5 + 5) + 1;
            }
        };

        Set set = new HashSet(Set.of(new Book(12,"Pavlo"), new Book(22,"Taras")));
        set.add(new Book(3, "Yaryna"));
        set.add(overridenBook);
        set.add(new Book(22, "Taras"));
        System.out.println(set.size());

    }

     static class Book {
        private String name;
        private int id;

        public Book(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
         public boolean equals(Object o) {
            if (this == o) return  true;
            if(o == null || getClass() != o.getClass()) return false;
            Book book =(Book)o;
            return id ==book.id && name.equals(book.name);

        }

        @Override
         public int hashCode() {
            return id;
        }
    }
}
