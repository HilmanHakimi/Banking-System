package Day3;

public class OverloadExample {

    //Overloaded methods with different parameteres types
    public void printMessage(String message){
        System.out.println("Message :" +message);
    }

    public void printMessage(int number){
        System.out.println("Number : "+ number);
    }

    //overloaded methods with different numbers of parameters
    public void printMessage(String message, int number){
        System.out.println("Message : "+ message);
        System.out.println("Number : " +number);
    }

    /*overloaded method with different return types (will result in error)
    public int printMessage(String message){
        System.out.println("Double number :"+ number);
    }*/


    //overloaded methods with different access modifiers
    private void printMessage(double number){
        System.out.println("Double number : " +number);
    }

    //overloaded methods with different exceptions
    public void printMessageWithException(String message) throws IllegalArgumentException{
        if (message == null || message.isEmpty()){
            throw new IllegalArgumentException("Message cannot be null or empty");
        }
        System.out.println("Message :" +message);
    }




    public static void main(String[] args) {
        OverloadExample example = new OverloadExample();

        //calling overload methods
        example.printMessage("hello");//calls printMessage string
        example.printMessage(10);//printMessage int
        example.printMessage("world", 20);//calls string plus int
        example.printMessage(3.14);//call the double

        try{
            example.printMessageWithException("");//throws illegal argument

        } catch (IllegalArgumentException e){
            System.out.println("Exception message : " + e.getMessage());
        }


    }
}
