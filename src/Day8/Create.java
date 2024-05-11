package Day8;

public class Create {
    Create ( ){
        System.out.println("1");
    }
    Create (int num){
        System.out.println("2");
    }
    Create (Integer num){
        System.out.println("3");
    }
    Create (Object num){
        System.out.println("4");
    }
    Create (int... nums){
        System.out.println("5");
    }

    public static void main(String[] args) {
        new Create(100);
        new Create(100L);
    }
}
