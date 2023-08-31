/* --------------------------------------------------------------
   I added the IMPLICIT parameter "this" to EVERY memory access
   -------------------------------------------------------------- */
public class Circle 
{
    public double radius = 1;       /** The radius of this circle */

    public Circle()                 /** Constructor 1 for a circle object */
    { 
    
    } 

    public Circle(double newRadius) /** Constructor 2 for a circle object */
    {
        this.radius = newRadius;
    }

    public double getArea()      /** Return the area of this circle */
    {
        return 3.14159 * this.radius * this.radius;
    }

    public void setRadius(double newRadius) /** Set new radius for this circle */
    {
       this.radius = newRadius;
    }
} 
