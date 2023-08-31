
// Experiment: extend a final class....

public final class GeometricObject
{
    private String color;

    GeometricObject( ) { }          // Constructor 1

    GeometricObject( String col )   // Constructor 2
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

