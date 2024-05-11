package Day1;

public class wrapper {
    public static void main(String[] args) {
        //allow data type to be treated as objects (hashmap or array where the variable cannot be use to store value)
        //conversion
        int primitiveInt = 10;
        Integer wrapperInt = Integer.valueOf(primitiveInt);//converter int to Integer
        int backToInt = wrapperInt.intValue(); //converter Integer to int
        System.out.println("Converted  in: "+ backToInt);

        //double primitive
        double primitiveDou = 10.3;
        Double wrapperDou = Double.valueOf(primitiveDou);//converter double  to Double
       double backToDou = wrapperDou.doubleValue(); //converter Double to double
        System.out.println("Converted  in: "+ backToDou);


        //utility methods in java
        String numberSTR = "123";
        int parseInt = Integer.parseInt(numberSTR); //parse string to int
        System.out.println("Parse int from string : "+parseInt);

        int compareResult = Integer.compare(10, 5); //compare two integer
        System.out.println("The result of compare is: " + compareResult); // (if a < b = -1, if a = b = 0, if a > b = 1)

        String binaryString = Integer.toBinaryString(65); //convert int to binary
        System.out.println(binaryString);

        //Null values
        Integer nullableint = null;
        System.out.println("The value of null is: "+ nullableint);

    }
}
