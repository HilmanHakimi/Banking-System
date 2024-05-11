 class Animal {
    String shout() {
        return "Quiet";
    }
}
  public class Dog extends Animal {
    String shout() {
        return "Bark";
    }
    public static void main(String[] args) {
        Animal myDog = new Dog();
        System.out.println(myDog.shout());
    }
}


