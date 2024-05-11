package Day6;

//Shape interface
interface Shape{
    double getArea();
    double getPerimeter();
}

//circle class implementing shape interface
class Circle implements Shape{
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}


//Rectangle class implementing shape interface
class Rectangle implements Shape{
    private final double length;
    private final double width;


    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea(){
        return length * width;
    }
    @Override
    public double getPerimeter(){
    return 2 * (length*width);
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {

     //create instance of circle and rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4,6);

        System.out.println("Circle Area : "+circle.getArea());
        System.out.println("Circle Parameter  : "+circle.getPerimeter());
        System.out.println("Rectangle Area : "+rectangle.getArea());
        System.out.println("Rectangle Perimeter: "+rectangle.getPerimeter());
    }

}
