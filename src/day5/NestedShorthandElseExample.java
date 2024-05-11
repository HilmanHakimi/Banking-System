package day5;

public class NestedShorthandElseExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        String result = (x > y)? "x is greater than y":((x < y)? "x is less than y ": "x and y are equal");
        System.out.println(result);
    }
}
