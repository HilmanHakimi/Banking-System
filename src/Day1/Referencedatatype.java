package Day1;

public class Referencedatatype {
    public static void main(String[] args) {
        //String(reference Type)
        String myString = "Hello JAVA";
        System.out.println("String: " +myString);

        //Array (Reference Type)
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.print("Array: ");
        for(int num:myArray){
            System.out.print(" " + num);
        }
    }
}
