public class Circle 
{
    private double radius = 1;      /** The radius of this circle */

    public Circle()                 /** Constructor 1 for a circle object */
    { 
    
    } 

    public Circle(double newRadius) /** Constructor 2 for a circle object */
    {
        radius = newRadius;
    }

    public Circle(Circle c)         /** Constructor 3: copies circle c */
    {
        radius = c.radius;  // Copies c.radius to radius of new Circle object
    }

    public double getArea()      /** Return the area of this circle */
    {
        return 3.14159 * radius * radius;
    }

    public double getRadius() /** Return radius of this circle */
    {
       return radius ;
    }

    public void setRadius(double newRadius) /** Set new radius for this circle */
    {
       radius = newRadius;
    }
} 
