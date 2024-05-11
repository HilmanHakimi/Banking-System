package Day3;

public class MethodExample {
    //method with no return type and no parameters
    public static void greet(){
        System.out.println("hello world");
    }

    //method with return type and parameters
    public static int add(int a, int b){
        return a +b;
    }


    //method with return type with no parameter
    public static double getPI(){
        return 3.14159;
    }

    //method with no return type and prameteres
    public static void printDetails(String name, int age){
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }

    public static void main(String[] args) {
        //calling the greet method
        greet();

        //calling the add method
        int sum = add ( 5, 3);
        System.out.println("Sum :" + sum);

        //callget PI method
        double pi = getPI();
        System.out.println("Value of PI : " + pi);

        //calling printDetails method
        printDetails("Alice", 27);


    }
}
