
public class Demo
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle();  // Create a Circle object circle1
        Circle circle2 = new Circle(2); // Create a Circle object circle2

        double area1 = circle1.getArea(); // Tell circle1 to run getArea()
        System.out.println("Area of circle1 = " + area1);

        double area2 = circle2.getArea(); // Tell circle2 to run getArea()
        System.out.println("Area of circle2 = " + area2);

        circle1.setRadius(5);          // Tell circle1 to run setRadius()

        area1 = circle1.getArea();     // Tell circle1 to run getArea()
        System.out.println("Area of circle1 = " + area1);
    }
}
