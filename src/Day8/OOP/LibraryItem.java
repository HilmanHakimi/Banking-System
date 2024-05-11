package Day8.OOP;

abstract class LibraryItem {
    private String name;
    private boolean isAvailable;

    public LibraryItem(String name){
        this.name = name;
        this.isAvailable = true;

    }

    public String getName(){
        return name;
    }
    public boolean isAvailable(){
        return isAvailable;
    }

    public void borrowItem(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("Item borrowed succesfully");
        }else{
            System.out.println("Sorry, this item is not available");
        }
    }
    public void returnItem(){
        isAvailable = true;
        System.out.println("Item returned succesfully");
    }

    public static void main(String[] args) {

    }

    public abstract String getDetails();
}
