
public class Demo
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle();  // Invokes Circle() 
        System.out.println("Radius circle1 = " + circle1.radius);

        Circle circle2 = new Circle(99); // Invokes Circle(double) 
        System.out.println("Radius circle2 = " + circle2.radius);
    }
}
