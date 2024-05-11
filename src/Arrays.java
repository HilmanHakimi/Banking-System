public class Arrays {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};//Initializes an array with values
        int[] numbers2 = new int[5]; //Initializes an array with size 5

        //Accessing Elements
        int firstelement = numbers[0]; //accessing the elements in array

        //Array length
        int arrayLength = numbers.length; //arrayLength is 5

        //iterating over arrays
        System.out.println("number: ");
        for(int i=0; i <numbers.length; i++){
            System.out.println(numbers[i]);
        }


        //multidimensional array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//First array position second array baru location dalam array
        int element = matrix [1] [2];

        //output
        System.out.println("The result of multidimensional array is : " + element);
        System.out.println("THe first elemnent of array is : "+firstelement);
        System.out.println("The length of array is : "+ arrayLength);






//        int[] numbers = new int[5]; //create array with the array size of 5
//        int[] numbers = {1, 2, 3, 4, 5};// Initialize array with values
//        numbers[0] = 1; //assign value to first element
//        int firstElement = numbers[0]; // Access the first element (1)
//        int arrayLength = numbers.length; //arrayLength is 5
//
//
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
    }
}
