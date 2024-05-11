class %Base {
    Base() {
        System.out.print("Base");
    }
}
public class Derived extends %Base {
    Derived() {
        System.out.print("Derived");
    }
    public static void main(String[] args) {
        new Derived();
    }
}
