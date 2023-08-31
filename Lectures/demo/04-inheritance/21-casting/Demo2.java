
public class Demo2
{
   public static void main(String[] args)
   {
	GeometricObject a = new GeometricObject("red");	// superclass reference

        Circle b;                                       // subclass reference

	b = (Circle) a;	 // This is a downcasting operation --> run time error!
	//b = a;		 // Error: downcasting must be made explcitly
			 // because it's UNSAFE (similar to double --> int)

        // **************************************************************
        // Downcasting is UNSAFE because you can make an ILLEGAL request
        // **************************************************************
        System.out.println(b.getRadius()); // This will compile without error !
   }
}
