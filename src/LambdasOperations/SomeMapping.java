package LambdasOperations;

import User.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SomeMapping {
    public static void main(String[] args) {

        User sarah = new User("Sarah", 28);
        User james = new User("James", 35);
        User mary = new User("Mary", 33);
        User john = new User("John", 25);

        List<User> users = List.of(sarah, james, mary, john);
        List<String> names = new ArrayList<>();
        Function<User, String> toName = (User user) -> user.getName();
        for(User user : users){
            String name = toName.apply(user);
            names.add(name);
        }
        users.forEach((User u) -> System.out.println(u));
        names.forEach((String  s) -> System.out.println(s));
    }
}
