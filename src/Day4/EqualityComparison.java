package Day4;

public class EqualityComparison {
    public static void main(String[] args) {
        //creating two strings with the same content but different memory locations
        String str1 = new String("hello");
        String str2 = new String("Hello");

        //using equals method to compare contents
        boolean equalResult = str1.equals(str2);
        System.out.println("Using equals(): "+equalResult);

        //using == operator to compare memory locations
        boolean refrenceEquality = (str1 == str2);
        System.out.println("Using == operator: "+refrenceEquality);

        //Creating two references pointing to the same string object
        String str3="Hello";
        String str4 = str3;

        //Using equals method to compare contents
        equalResult = str3.equals(str4);
        System.out.println("Using equals(): " + equalResult);

        //Using == operator to compare memory location
        refrenceEquality = (str3 == str4);
        System.out.println("Using == operator: "+ refrenceEquality);
    }
}
