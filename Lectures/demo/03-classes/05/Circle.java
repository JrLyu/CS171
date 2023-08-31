
/* ------------------------------------------------------------------
   Show the "Constructor rules":

	(A) A class MUST have at least 1 constructore
	(B) IF a class has NO constructor, Java will insert the
	    "default constructor" into the class definition

   (1) Delete Constructor 1 and compile Demo.java
   (2) Delete Constructor 2 ALSO and compile Demo.java
   ------------------------------------------------------------------ */

public class Circle 
{
    double radius = 1;       /** The radius of this circle */

    Circle()                 // Constructor 1 
    {
    }

    Circle(double newRadius) // Constructor 2 
    {
        radius = newRadius;
    }
}

/* ------------------ Original ------------------------
    Circle()                 // Constructor 1 
    {
    }

    Circle(double newRadius) // Constructor 2 
    {
        radius = newRadius;
    }
   ------------------------------------------------------ */
