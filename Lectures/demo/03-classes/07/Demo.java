
public class Demo
{
    public static void main(String[] args)
    {
        // Copying a primitive type variable
        int k = 5;
        int c = k; 			// Copy k to c
        
        c = 99;				// Update
        System.out.println(k);  	// k unchanged - prints 5

        // Copying a reference type variable
        Circle circle1 = new Circle(5); 
        Circle circle2 = circle1;	// Copy circle1 to circle2
        
        circle2.radius = 99;		// Update
        System.out.println( circle1.radius ); // circle1.radius CHANGED: 99
    }
}
