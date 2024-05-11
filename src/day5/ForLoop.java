package day5;

public class ForLoop {
    public static void main(String[] args) {
        int number =  5 ;
        int factorial = 1;


        //calculate the factorial number
        for(int i =1; i<= number; i++){
            factorial *=i;
        }
        System.out.println("Factorial of " + number + " is "+factorial);
    }
}
