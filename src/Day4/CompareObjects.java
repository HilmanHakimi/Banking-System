package Day4;

import java.util.Objects;

//define a class person
class Person{
    private String name;
    private int age;

    //constructor to initialize name and age
    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }

    //Override the equals to compare the object based on name and age
    @Override
    public  boolean equals (Object o){
        if(this == o) return true; // if the objects are the ssame instance,
        //they are equal


        if(o==null || getClass() != o.getClass())return false;
        //if the classes are different they are not equal

        Person person = (Person) o; //cast the object to person class
        return age == person.age && Objects.equals(name, person.name);


    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age);

    }
}

public class CompareObjects {
    public static void main(String[] args) {
        //create three person objects
        Person person1 = new Person("hilman", 30);
        Person person2 = new Person("danish" , 30);
        Person person3 = new Person("sam" , 1000);

        //comparing two objects with the same content
        System.out.println("person1.equals(person2): " + person1.equals(person2));

        //comparing two objects with different content
        System.out.println("person1.equals(person3): "+person1.equals(person3));

    }
}
