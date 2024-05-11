package Day9;

public class CommandLineArgumentDemo {
    //
    public static void main(String[] args) {
        //check if any arguments were provided

        if(args.length == 0){
            System.out.println("No arguments provided");
        }else{
            //print out all the arguments that provided
            System.out.println("Arguments provided");
            for(int i = 0; i<args.length; i++){
                System.out.println((i+1)+" "+args[i]) ;
            }
            //calculate sum of all the integers arguments
            int sum = 0;
            for(String arg: args){
                try{
                    int num = Integer.parseInt(arg);
                    sum += num;
                }catch (NumberFormatException e){
                    //ignore num int arguments
                }
            }
            System.out.println("Sum of integers arguments: "+sum);
        }
    }
}
