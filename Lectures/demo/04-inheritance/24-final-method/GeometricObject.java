
// Experiment: override a final method....

public class GeometricObject
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

    public final double getArea()  // ***** A FINAL method ******
    {
        return 0;  // Some default value
    }

    // No "toString()" method defined !
    // (Inherits "automatically" from Object)
}

