package Day4;

public class StringBuilderExample {
    public static void main(String[] args) {

        //Create a new String builder
        StringBuilder sb = new StringBuilder();

        //Modifies the StringBuilder object directly (append some strings)
        sb.append("Java");
        sb.append(" ");
        sb.append("Nice");
        sb.append("!");

        //print initial value of java nice!
        System.out.println(sb);

        //insert a string to a specific position
        sb.insert(5, "Coffee");// insert the string into the position 5 start from 1
        System.out.println(sb);

        //delete a portion of the string
        sb.delete(5, 12); //Need to declare the start position to delete and the end which is 5 to 9
        System.out.println(sb);

        //replacce a portion of the string
        sb.replace(0, 7, "oooohhhhh");
        System.out.println(sb);

        //reverse the string
        sb.reverse();
        System.out.println(sb);

        String result = sb.toString();//Converts StringBuilder to String
        System.out.println(result);
    }
}
