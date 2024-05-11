package day10;

//Default (no modifier) class accessible only within the same package
class DefaultClass{
    void defaultMethod(){
        System.out.println("This is the default method");
    }
}

//another class in the same package as DefaultClass
class AnotherClass{
    void anotherMethod(){
        //accessing defaultmethod from DefaultClass
        DefaultClass dc = new DefaultClass();
        dc.defaultMethod();
    }
}

class ProtectedClass {
    protected void protectedMethod(){
        System.out.println("This is the protected method");
    }
}

class Subclass extends ProtectedClass{
    void accessProtectedMethod(){
        protectedMethod();//accessing protectedMethod from super class
    }
}

//private class is not accessible outside of the file
//this is not allowed

//private class PrivateClass{
//    private void privateMethod(){
//        System.out.println("This is the private method");
//    }
//}

public class Main {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
        pc.publicMethod();//accessing public method

        DefaultClass dc = new DefaultClass();
        dc.defaultMethod();//accessing default method

        AnotherClass ac = new AnotherClass();
        ac.anotherMethod();//accessing defaultmethod from another class

        Subclass subclass = new Subclass();
        subclass.accessProtectedMethod();//accessing Protected method

    }
}
