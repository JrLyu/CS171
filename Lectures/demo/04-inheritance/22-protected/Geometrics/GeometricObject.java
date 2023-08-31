
package Geometrics;

public class GeometricObject
{
    private String color;

    public GeometricObject( ) { }          // Constructor 1

    public GeometricObject( String col )   // Constructor 2
    {
        color = col;
    }

    public String getColor()          
    { 
	return color; 
    }

    public void setColor(String c)
    { 
	color = c; 
    }   

    public double getArea()  // **** Dummy method !! (for polymorphism) ****
    {
        return 0;  // Some default value
    }

    // No "toString()" method defined !
    // (Inherits "automatically" from Object)
}

