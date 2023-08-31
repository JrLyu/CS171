
public class Demo
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(5);  

        Circle c = circle1;	   // c is now an alias for circle1
        
        c.radius = 99;				    // Also updates circle1.radius
        System.out.println( circle1.getRadius() );  // Prints: 99
    }
}
