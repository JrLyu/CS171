//
// Show a method in same package can access "protected" members
//
// Compile with:   javac -cp .. Demo.java
// Run with:       java  -cp .. Deometrics/Demo
//

package Geometrics;

/* -------------------------------------------------
   Member radius in Circle has "protected" access

   The Demo class is NOT a subclass of Circle
   BUT: the Demo class is in the SAME package !
   ------------------------------------------------ */
public class Demo
{
   public static void main(String[] args)
   {
        Circle c = new Circle("red", 2); // b is a subclass reference

	System.out.println("Radius c.radius = " + c.radius);
   }
}
