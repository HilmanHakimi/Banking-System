package Day7;




public class UncheckedException {
    public static void main(String[] args) {
        //intializing variables
        int a = 10;
        int b = 0;

        try{
            //attempting to divide a by b (which is zero0
            int result = a/b;
        }catch (ArithmeticException e){
            System.out.println("Division by zero : "+ e.getMessage());
        }
    }
}
