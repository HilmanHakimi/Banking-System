package day5;

public class BreakContinueExample {
    public static void main(String[] args) {
        //Example of using break
        for(int i=1; i<=10; i++){
            if(i==5){
                break; // break the loop when i reaches 5
            }
            System.out.println("i: "+i);
        }

        System.out.println();//empty line for separation

        //example of using continue
        for (int i =1; i<=10; i++){
            if(i % 2 == 0){
                continue; //skip even number
            }
            System.out.println("i: "+i);
        }
    }
}
