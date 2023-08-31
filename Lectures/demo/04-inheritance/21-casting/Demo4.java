
public class Demo4
{
   public static void main(String[] args)
   {
	GeometricObject a = new Circle("red", 1); // (1) Performs upcasting

	System.out.println(a.getArea());   // Polymorphism !

	// *****************************************
	// Situation where downcasting is safe
	// *****************************************
	Circle b;

	b = (Circle) a;		           // Safe downcasting
	System.out.println(b.getRadius()); // We can NOW invoke getRadius() !
   }
}
