package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Locale.filter;

public class LambdaExample {
    public static void main(String[] args) {
        //List of integer
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //using a language expression to define  condition for an even numbers
        Predicate<Integer> isEven = n -> n % 2 ==0;

        //Filtering the list number using filter method
        List<Integer> evenNumber = filter(numbers,isEven);

//        button.addEventListene(e -> {
//            //cod to handle event
//        });
//
//        new Thread(()->{
//            //code with task to evecate at new thread
//        });

        //printing the list of even number
        System.out.println("Even number is :" +evenNumber);

    }
    //method to filter list based on a predict
    public static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate){
        //Result list to store filtered numbers
        List<Integer> result = new ArrayList<>();

        //iterate through each number in the input list
        for(Integer number : numbers){
            //checking if the number is satisfied the predicate
            if(predicate.test(number)){

                //adding the number to list
                result.add(number);
            }
        }
        //returning to return list
        return result;
    }
}
