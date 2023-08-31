public class Circle
{
    public        double radius = 1;    /** An instance variable */
    public static int count;            /** A  "static" variable */

    public Circle()                 /** Constructor 1 for a circle object */
    { 
        count++;    // Keep track of # Circle obj created
    }
    
    public Circle(double newRadius) /** Constructor 2 for a circle object */
    {
        radius = newRadius;
        count++;    // Keep track of # Circle obj created
    }

    public double getArea()      /** Return the area of this circle */
    {
        return 3.14159 * radius * radius;
    }

    public void setRadius(double newRadius) /** Set new radius for this circle */
    {
       radius = newRadius;
    }
}  
