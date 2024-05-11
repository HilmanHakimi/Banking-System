public class string {
    public static void main(String[] args) {
        String str1 = "Hello"; //using string literalls
        String str2 = new String("World"); //using string constructor


        //immuatability
        String str3 = str1 + " " + str2; //using the operartor
        String str4 = str1.concat(" ");//concat method

        //length
        int length =  str1.length();

        //accessing characters
        char firstchar = str1.charAt(0);

        //comparison
        boolean isEqual = str1.equals(str2);
        boolean isSameObject = str1 == str2;

        //substring
        String substring = str1.substring(0); //"world"

        //formatting
        String formattedString = String.format("the value of pi is %.2f", Math.PI);
        System.out.printf("The value of pi is %.2f%n", Math.PI);

        //output
        System.out.println("str1 :" +str1);
        System.out.println("str2 " +str2);
        System.out.println("concatenated string : "+str3);
        System.out.println("concatenated using concate() :" + str4);
        System.out.println("Length of str1 :" + length);
        System.out.println("first character : " +firstchar);
        System.out.println("is str1 equal to  str 2: " + isEqual);
        System.out.println("is str1 is the same object with str2 : " + isSameObject);
        System.out.println("substring of str :" + substring);
        System.out.println(formattedString);


    }
}
