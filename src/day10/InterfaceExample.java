package day10;

//Define the interface with methods for calculating area and perimeter
interface Shape {
    double calculateArea();//calculate area of the shape
    double calculatePerimeter();//calculate the perimeter of the shape

}
//implement the shape of interface for a circle
class Circle implements Shape{
    private double radius;

    //constructor to initialize the radius of the circle
    public  Circle(double radius){
        this.radius = radius;
    }
    //calculate the area of the circle
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    //calculate the perimeter of the circle
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
//implement the shape interface for example
class Rectangle implements Shape{
    private double width;
    private double height;

    //constructor to initialized the weight and height of rectangle
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    //calculate the area of rectangle
    public double calculateArea(){
        return width * height;
    }

    //calculate the perimeter of the rectangle
    public double calculatePerimeter(){
        return 2 * (width + height);
    }


}




public class InterfaceExample {
    public static void main(String[] args) {

        //create the instance of the circle and rectangle
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        //calculate and print the area and perimeter of the circle
        System.out.println("Area of circle "+circle.calculateArea());
        System.out.println("Perimeter of circle "+circle.calculatePerimeter());


        //calculate amd print the area
        System.out.println("Area of rectangle "+ rectangle.calculateArea());
        System.out.println("Perimeter of circle "+rectangle.calculatePerimeter());


    }
}
