package Day7;

public class ThrowExample {
    public static void main(String[] args) {
        //Assume we are receiving the age as input rom somewhere
        int age = -4;//age cannot be negative

        try{
            //check if age is negative
            if(age<0){
                //if the age is negative, throw and illegal argument with descriptive message
                throw new IllegalArgumentException("Age cannot be negative");
            }
            //if age is not negative print age
        }catch(IllegalArgumentException e){
            //if an illegalargument is caught print an error message
            System.out.println("An error occured: "+ e.getMessage());
        }finally {
            System.out.println("Finally block is executed");
        }
    }
}
