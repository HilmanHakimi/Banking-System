package Quiz;

public class OCA {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Leaves growing");

        do {
            builder.delete(0, 5);
            System.out.println(builder);
        } while (builder.length() > 5);
        System.out.println(builder);

    }
}
