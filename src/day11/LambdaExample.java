package day11;

import java.util.ArrayList;
import java.util.List;
public class LambdaExample {
    public static void main(String[] args) {
        //create a list of strings
        List<String> names = new ArrayList<>();
        names.add("sam");
        names.add("Megat");
        names.add("antonio");
        names.add("alex");

        //use foreach method to iterate over each element in the list
        //and print in console using a lambda expression
        names.forEach(name  -> System.out.println(name));
    }
}
