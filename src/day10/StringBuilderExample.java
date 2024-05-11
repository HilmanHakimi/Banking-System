package day10;

public class StringBuilderExample {
    public static void main(String[] args) {
        //create a stringbuilder with the initial value of "hello"
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("Original stringbuilder: "+sb);

        //append a string to the string builder
        sb.append("everyone");
        System.out.println("After append: "+sb);

        //insert a string at aspecific position in string builder
        sb.insert(5, ",");
        System.out.println("After insert: "+sb);

        //replace a substring in the stringbuilder
        sb.replace(6, 11,"java");
        System.out.println("After replace: "+sb);

        //delete a substring in string builder
        sb.delete(5,9);
        System.out.println("After delete: "+sb);

        //reverse the contents of the string builder
        sb.reverse();
        System.out.println("After reverse: "+sb);

        //convert stringbuilder to a String
        String result = sb.toString();
        System.out.println("Converted to string: "+sb);

    }
}
