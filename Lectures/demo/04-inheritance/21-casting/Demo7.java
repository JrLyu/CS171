
public class Demo7
{
   public static void main(String[] args)
   {
        GeometricObject a = new Circle("red", 1);       // Upcasting
//      GeometricObject a = new Rectangle("red", 1, 2); // Upcasting
//      GeometricObject a = new GeometricObject("red"); 

	if ( a instanceof Circle )
        {
            Circle b = (Circle) a; // Downcast to a Circle

	    System.out.println("Radius = " + b.getRadius());
        }
	else if ( a instanceof Rectangle )
	{
            Rectangle b = (Rectangle) a; // Downcast to a Rectangle

	    System.out.println("Width  = " + b.getWidth());
	    System.out.println("Height = " + b.getHeight());
	}
	else
	    System.out.println("Invalid subclass type");
   }
}
