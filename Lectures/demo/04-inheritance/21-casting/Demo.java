
public class Demo
{
   public static void main(String[] args)
   {
	GeometricObject a;		 // a is a superclass reference

        Circle b = new Circle("red", 2); // b is a subclass reference

	a = (GeometricObject) b;	 // This is a upcasting operation
	a = b;				 // Because it's safe, we can omit 
					 // the explicit casting operator

	// *****************************************
	// Make all the request in GeometricObject
	// *****************************************
	System.out.println(a.getColor());
	a.setColor("blue");
	System.out.println(a.getColor());
	System.out.println(a.getArea());   // Polymorphism !
   }
}
