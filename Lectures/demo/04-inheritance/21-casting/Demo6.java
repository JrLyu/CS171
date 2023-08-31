
public class Demo6
{
   public static void main(String[] args)
   {
	GeometricObject a = new Circle("red", 1);       // Upcasting
//	GeometricObject a = new Rectangle("red", 1, 2); // Upcasting

	if ( a instanceof Circle )
	    System.out.println("a is a Circle");

	if ( a instanceof Rectangle )
	    System.out.println("a is a Rectangle");

        if ( a instanceof GeometricObject )
            System.out.println("a is a GeometricObject");
   }
}
