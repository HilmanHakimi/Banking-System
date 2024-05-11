package Day3;

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // Arrays
        int[] array = new int[5]; // Creating an array of size 5
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

        // ArrayLists
        ArrayList<Integer> arrayList = new ArrayList<>(); // Creating an ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        System.out.println("\nArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Element at index " + i + ": " + arrayList.get(i));
        }
    }
}
