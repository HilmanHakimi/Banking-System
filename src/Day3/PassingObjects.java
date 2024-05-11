package Day3;

public class PassingObjects {
    //private field (variable) to store the name
    private String name;

    //constructor to initialize the name
    public PassingObjects(String name){
        this.name = name;

    }

    //getter method to retrieve the name
    public String getName(){
        return name;
    }

    //setter method to set name
    public void setName(String name){
        this.name =name;
    }



    public static void main(String[] args) {
        //create a new pasingobj with the name of "sam"
        PassingObjects person = new PassingObjects("sam");

        //print the name before changing
        System.out.println("before : "+person.getName());

        //call the changeName method to change the name of the person
        changeName(person);

        //print the name after changing
        System.out.println("After : "+person.getName());
    }
    //method to change the name of the passing object
    public static void changeName(PassingObjects person){
        //call the setName method of the person to set then new name
        person.setName("alice");
    }
}
