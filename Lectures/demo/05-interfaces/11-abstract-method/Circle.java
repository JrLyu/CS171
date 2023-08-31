public class Circle extends GeometricObject
{
    private double radius;	    // *** New member var

    Circle(String col, double r)    // Constructor not inherited
    {
        setColor(col); 
	radius = r;
    }

    public double getRadius()        // *** New method
    { 
	return radius;
    }

    public void setRadius(double r)   // *** New method
    { 
	radius = r; 
    }

    // Overrides the inherited "dummy method"
    public double getArea()
    {
        return 3.14159*radius*radius;
    }

    // Override the "toString()" method
    public String toString()
    {
        return "Color = " + getColor() + " : " + "radius = " + radius;
    }
}
