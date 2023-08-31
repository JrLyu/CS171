public class Demo2
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(4);

	circle1.count = 99;

	System.out.println( circle1.radius );
	System.out.println( circle1.count );  
	System.out.println( circle2.radius );
	System.out.println( circle2.count ); 
	System.out.println();

	circle1.count++;  // Updates a static variable

	System.out.println( circle1.radius );      
	System.out.println( circle1.count );    // Changed
	System.out.println( circle2.radius );      
	System.out.println( circle2.count );    // Also changed --> shared!
    }
} 
