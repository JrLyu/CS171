
public class Demo
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle();  // Create a Circle object circle1

        double area1 = circle1.getArea(); // Tell circle1 to run getArea()
        System.out.println("Area of circle1 = " + area1);

        circle1.radius = 10;   // Update the radius variable directly

        area1 = circle1.getArea();     // Tell circle1 to run getArea()
        System.out.println("Area of circle1 = " + area1);
    }
}
