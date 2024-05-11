import java.sql.SQLOutput;

public class variables {
    //class variable (static variable)
    static int classVariable = 10;


    //instance variable
    int instanceVariable = 20;

    public static void main(String[] args) {

        //local variable
        int localVariable = 30;

        //accessing and modifying the class variable

        System.out.println("class variable before modification :"+ classVariable);
        classVariable = 50;
        System.out.println("class variable after modifying : "+ classVariable);

        //creating an instance of the class to access instance variable
        variables obj = new variables();
        System.out.println("Instance variables: " + obj.instanceVariable);

        //accessing local variables
        System.out.println("Local variable : " +localVariable);

        //invoking a method with parameter
        int sum = calculateSum(10, 20);
        System.out.println("Sum calculated in method :" + sum);


    }

    //method with parameter

    public static int calculateSum(int a, int b){
        return a + b;
    }

}
