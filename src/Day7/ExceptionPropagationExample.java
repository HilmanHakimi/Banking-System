package Day7;

public class ExceptionPropagationExample {
    public static void main(String[] args) {
        try{
            //call method1 which can throw an exception
            method1();
        }catch(Exception e){
            System.out.println("Exception caught in main method: "+e.getMessage());
        }
    }
    //method1 declares that it can throw exception
    public static void method1()throws Exception{
        System.out.println("inside method1");
        //call method2 which is also a exception
        method2();}

    //method 2 declares that it can throw Exception
    public static void method2() throws Exception{
        System.out.println("Inside method2");
        //call method3 which also can throw exception
        method3();
    }
    //method3 declares that it can throw can Exception
    public static void method3() throws Exception{
        System.out.println("Inside method 3");
        //simulating an exception by dividing zero
        int result = 5/0;
    }

}
