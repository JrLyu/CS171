
public class Demo3
{
   public static void main(String[] args)
   {
	GeometricObject a = new Circle("red", 1); // (1) Performs upcasting

	System.out.println(a.getArea());   // Polymorphism !

	// *****************************************
	// Now we can't get it radius through a
	// *****************************************
	System.out.println(a.getRadius()); // Compile error...
   }
}
