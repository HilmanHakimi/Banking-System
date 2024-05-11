package Day7;

public class TryCatchExample {
    public static void main(String[] args) {
        try{
            int [] numbers = {1,2,3};
            //attempting to access the elements at index 3 which doesnt exiat in array
            System.out.println("Accessing elements at index 3: "+ numbers[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            //catch and handle the ArrayIndexOutOfBounds
            System.out.println("An error occurred: "+e.getMessage());
        }finally{
            //this block is always executed regardless of whether and exception is thrown or not
            System.out.println("Finally block excecuted");
        }

    }
}
