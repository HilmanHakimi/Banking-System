package Day1;

public class Assignmentoperators {
    public static void main(String[] args) {
        //addition
        int H = 10;
        H += 3;
        System.out.println("addition :" +H);

        //substraction
        int c =20;
        c-=7;
        System.out.println("substraction : " +c);

        //multiplication
        int d = 23;
        d *=5;
        System.out.println("mul value is : " + d );

        //division
        int k = 34;
        k /=8;
        System.out.println("division is :" + k);

        //Logical AND
        boolean a = false;
        boolean b = true;
        boolean result1 = a && b;
        System.out.println("a && b :" +result1);




        //Logical OR
        boolean result2 = a || b;
        System.out.println("a || b :" +result2);

        //Logical Not
        boolean result3 = (!a);
        System.out.println(result3);


    }
}
