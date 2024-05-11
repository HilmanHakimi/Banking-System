package day5;

public class NestedIfElseExample {
    public static void main(String[] args) {
        int x = 20;
        int y = 50;

        if(x == y){
            System.out.println("x and y are equal");
        }
        else{
            if(x > y){
                System.out.println("x is greater than y");
            }
            else{
                System.out.println("x is less than y");
            }
        }
    }
}
