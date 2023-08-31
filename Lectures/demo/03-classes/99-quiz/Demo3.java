public class Demo3
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(4);
	int    x       = 4;

	System.out.println( circle1.getRadius() + " " + x ); // 4 4
	incrementRadius( circle1 );        // Pass a reference type variable
	incrementInt( x );                 // Pass a primitive type var
	System.out.println( circle1.getRadius() + " " + x);  // 5 4
    }

    // Method updates object passed as parameter
    public static void incrementRadius( Circle c )
    {
        c.radius++;   // Increment c.radius by 1
    } 

    // Method updates int passed as parameter
    public static void incrementInt( int c )
    {
        c++;          // Increment c by 1
    } 
}
