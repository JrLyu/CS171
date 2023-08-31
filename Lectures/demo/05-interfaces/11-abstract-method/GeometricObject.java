
// Abstract method getArea()

public abstract class GeometricObject
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

    public abstract double getArea();  // for polymorphism
}

