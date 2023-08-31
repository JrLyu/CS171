public class Demo
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(2);
 
	System.out.println( circle1.radius );
	System.out.println( "Count = " + circle1.count );  
	System.out.println();

        Circle circle2 = new Circle(4);

	System.out.println( circle2.radius );
	System.out.println( "Count = " + circle2.count ); 
    }
}
