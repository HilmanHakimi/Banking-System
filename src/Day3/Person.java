package Day3;

public class Person {

    //private fields variable to store name and age
    private final String name;
    private final int age;


    //constructor with parameters to initialize name and tags
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //getter method to receive the name
    public String getName(){
        //return the value of the name field
        return name;
    }

    //getter method to retrieve the name
    public int getAge(){
        return age;
    }


    public static void main(String[] args) {
        //create a new person object with name Mikey and age 30
        Person person = new Person("Mikey", 30);

        //use the getter methods to retrieve the name and age of the person
        String personName = person.getName();
        int personAge  = person.getAge();

        //print the name and age to the console
        MethodExample.printDetails(personName, personAge);

    }
}
