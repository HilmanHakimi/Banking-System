package Day1;

public class typecasting {
    public static void main(String[] args) {
        //Explicit Casting
        double d = 10.5;
        int i = (int) d;
        System.out.println("i : " + i);

        //Implicit Casting
        int numInt = 10;
        double numDouble = numInt;
        System.out.println("numInt: "+ numInt);
        System.out.println("numDouble: "+ numDouble);
    }
}
