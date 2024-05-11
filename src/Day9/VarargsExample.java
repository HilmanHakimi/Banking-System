package Day9;

public class VarargsExample {
    public static void main(String[] args) {
        //invoke the message method with two strings as arguments
        printMessages("Hello", "World");
        //invoke the printMessage with three strings as argument
        printMessages("java", "is", "awesome");

        //invoke the printMessage with three strings as argument
        printMessages("java", "is", "awesome" , "good");
    }
    //define a method PrintMessage with accepts a variable number of strings argument
    public static void printMessages(String...messages){
        //print a message indicating the start of the messages
        System.out.println("Messages: ");
        //iterate through each message in the array of messages
        for (String message : messages){
            //print eacch message followed by space
            System.out.println(message +" ");
        }
        //print a newline to move to the next line
        System.out.println();
    }
}
