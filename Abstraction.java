abstract class Abstraction_Shape {
     abstract double calculateArea();
     abstract double calculatePerimeter();
    public static void main(String[] args){
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Circle");
        System.out.println("Area of Circle :"+ circle.calculateArea());
        System.out.println("perimiter of circle :"+circle.calculatePerimeter());

        System.out.println("rectangle");
        System.out.println("Area of rectangle :"+ rectangle.calculateArea());
        System.out.println("perimiter of rectangle :"+rectangle.calculatePerimeter());
    }
}


class Circle  extends Abstraction_Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius ;
    }
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Abstraction_Shape {
    private  double length;
    private double breath;
    public Rectangle(double length , double breath){
        this.length = length;
        this.breath = breath;
    }
    public double calculateArea(){
        return (length * breath);
    }
    public double calculatePerimeter(){
        return 2 *(length * breath);
    }
}
