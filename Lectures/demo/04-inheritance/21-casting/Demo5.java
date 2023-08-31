
public class Demo5
{
   public static void main(String[] args)
   {
	GeometricObject a = new Rectangle("red", 1, 2); // Upcasting

	System.out.println(a.getArea());   // Polymorphism !

	// *****************************************
	// Situation where downcasting is safe
	// *****************************************
	Rectangle b;

	b = (Rectangle) a;	           // Safe downcasting
	System.out.println(b.getWidth());  // We can NOW invoke getWidth() !
	System.out.println(b.getHeight()); // We can NOW invoke getHeight() !
   }
}
