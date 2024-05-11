package Day8;

interface Animal {
    default void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog implements Animal{
    public void eat(){
        System.out.println("Dog is eating");
    }
}

class Puppy extends Dog {
    public void eat() {
        System.out.println("Puppy is eating");
    }
}
public class main{
    public static void main(String[] args) {
        Animal animal = new Puppy();
        Dog dog = (Dog) animal;
        Puppy puppy = (Puppy) dog;
        animal.eat();
        dog.eat();
        puppy.eat();}
}