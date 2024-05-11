package day5;

public class LoopThroughArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sum = 0;

        //loop through the array and calculate the sum
        for(int i=0; i<numbers.length; i++){
            sum +=numbers[i];
        }
        System.out.println("Sum of all elements :"+sum);
    }
}
