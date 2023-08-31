
public class Demo
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(4);  

        System.out.println( circle1.getRadius() ); // Prints  4

	updateCircle( circle1 );
	System.out.println( circle1.getRadius() ); // Prints: ?? <---
    }

    public static void updateCircle( Circle c )
    {
        c = new Circle(99);
    } 
}
