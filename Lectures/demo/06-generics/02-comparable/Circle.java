
// Circle implements the ComparableThing interface for Circle ONLY

public class Circle extends GeometricObject implements ComparableThing<Circle>
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

    // We can override compareTo( ) using Circle because T = Circle

    public int compareTo( Circle other )
    {
        // Data type of other is Circle --> no downcasting required !

        double diff = this.getArea() - other.getArea();
        return (int) Math.signum(diff);
    }

    // Override the "toString()" method
    public String toString()
    {
        return "Color = " + getColor() + " : " + "radius = " + radius;
    }
}
