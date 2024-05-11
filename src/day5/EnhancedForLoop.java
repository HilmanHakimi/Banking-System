package day5;

import java.util.ArrayList;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sum = 0;

        //using enhanced for loop to calculate the sum
        for (int number : numbers){
            sum +=number;
        }
        System.out.println("sum of numbers: "+sum);


        ArrayList<String> names = new ArrayList<>();
        names.add("Sam");
        names.add("Antonio");
        names.add("Amirul");

        //For loop for Array
        for (String name : names) {
            System.out.println("Names:" + name);
        }


    }
}
