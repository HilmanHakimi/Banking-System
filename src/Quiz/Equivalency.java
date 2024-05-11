package Quiz;

public class Equivalency {
    public static void main(String[] args) {
        final String ceiling = "up";
        String floor = new String("up");
        final String wall = new String(floor);
        System.out.println((ceiling==wall)+" "+(floor==wall)+" "+ceiling.equals(wall));
    }
}
