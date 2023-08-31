/* --------------------------------------------------
   Compile with:

	javac -cp .. Demo.java
   -------------------------------------------------- */

package p1;   // Inserted by BlueJ (You can also do it manually)

public class Demo
{
    void aMethod()
    {
        C1 o = new C1();
        
        o.x1 = 1;
        o.x2 = 99;  // Package - No compile error
        
        o.m1();
        o.m2();     // Package - No compile error
    }
}
  
