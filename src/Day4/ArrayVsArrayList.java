package Day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        //Fixed size vs dynamic size

        int[] array = new int[3];//creating an array with a fixed size of 3
        ArrayList<Integer>  arraylist = new ArrayList<>();//creating an array list

        //adding elements to the array
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        //addding elements to the array list
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);

        System.out.println("Array: "+ array.length+ "elements");
        System.out.println("ArrayList: "+ arraylist.size()+" elements");


        //type safety
        Object[] mixedArray = new Object[3]; ///Create new object
        mixedArray[0] = 1;
        mixedArray[1] = "Hello";
        mixedArray[2] = true;

        ArrayList<Integer> integerList = new ArrayList<>();
        //create an array list of integer
        integerList.add(1);
        integerList.add(2);

        //performance
        int[] largeArray = new int[1000000]; //Create a large array
        ArrayList<Integer>  largeArrayList = new ArrayList<>();

        long startTime = System.nanoTime();
        largeArray[999999] = 1; //accessing element in array
        long  endtime = System.nanoTime();
        long arrayAccessTime = endtime - startTime;

        startTime = System.nanoTime();
        largeArrayList.add(1); // add an element in array list
        endtime = System.nanoTime();
        long arrayListAddTime = endtime - startTime;

        System.out.println("Array access time: "+ arrayAccessTime+ "ns");
        System.out.println("ArrayList add time "+ arrayListAddTime+ "ns");




    }
}
