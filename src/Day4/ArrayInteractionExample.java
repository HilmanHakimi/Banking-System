package Day4;

import java.util.Arrays;

public class ArrayInteractionExample {
    public static void main(String[] args) {
        //array length
        int[] numbers = {1, 2, 3, 4, 5};
        int length = numbers.length;
        System.out.println("Array length: "+length);

        //accessing element
        int thirdElement = numbers[2];
        System.out.println("The third element is : "+ thirdElement);

        //modifying element
        numbers[0] = 10;
        System.out.println("Modified array :"+ Arrays.toString(numbers));

        //copying the array
        int[] source = {1,2,3,4,5};
        int[] destination = new int[source.length];
        System.arraycopy(source, 0,destination,0,source.length);
        System.out.println("Coppied array:"+Arrays.toString(destination));

        //sorting arrays
        int[] unsortedNumbers = {5,3,1,4,2};
        Arrays.sort(unsortedNumbers);
        System.out.println("Sorted : "+Arrays.toString(unsortedNumbers)); // (.toString) is to display the array

        //searching array
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of number 3: "+index);//Find the index for number 3 // index starts from 0

        //filling arrays
        int[] filledArray = new int[4];//isi berapa space array
        Arrays.fill(filledArray, 8);//value untuk diisi
        System.out.println("Filled array: " +Arrays.toString(filledArray));


    }
}
