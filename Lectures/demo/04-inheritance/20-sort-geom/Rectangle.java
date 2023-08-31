
public class Rectangle   extends GeometricObject
{
    private double width;
    private double height;

    Rectangle(String col, double w, double h)
    {
        setColor(col); 
	width = w; 
	height = h;
    }

    public double getWidth()   
    { 
	return width;
    }

    public void   setWidth(double w)
    { 
	width = w; 
    }

    public double getHeight() 
    { 
	return height;
    }

    public void setHeight(double h) 
    { 
	height = h; 
    }

    // Overrides
    public double getArea()       
    {
        return width*height;
    }

    public String toString()
    {
        return "Color = " + getColor() + " : " +
		"width = " + width + ", " +
		"height = " + height;
    }
}
