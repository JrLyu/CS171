
public class Demo2
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(4);  

        System.out.println( circle1.getRadius() );   // Prints: 4

        incrementRadius( circle1 );	 	     // Pass circle1
        System.out.println( circle1.getRadius() );   // Prints: 5
    }

    // Method updates object passed as parameter
    public static void incrementRadius( Circle c )
    {
        c.radius++;   // Increment radius by 1
    } 
}
