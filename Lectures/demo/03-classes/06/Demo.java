
public class Demo
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle();  // Create a Circle object circle1
        Circle circle2 = new Circle(2); // Create a Circle object circle2

        circle1.radius = 10;   // Access the radius in circle1 object
        circle2.radius = 99;   // Access the radius in circle2 object

        double area1 = circle1.getArea(); // Invoke getArea() method on circle1
        double area2 = circle2.getArea(); // Invoke getArea() method on circle2
    }
}
