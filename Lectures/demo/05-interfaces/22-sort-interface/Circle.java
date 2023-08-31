


public class Circle extends GeometricObject implements ComparableThing
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

    // We must override compareTo( ) using same signature in ComparableThing

    public int compareTo( ComparableThing other )
    {
        Circle help = (Circle) other;

        double diff = this.getArea() - help.getArea();
        return (int) Math.signum(diff);
    }

    // Override the "toString()" method
    public String toString()
    {
        return "Color = " + getColor() + " : " + "radius = " + radius;
    }
}
