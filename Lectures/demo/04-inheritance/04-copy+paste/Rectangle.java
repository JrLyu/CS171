
public class Rectangle
{
    private String color;
    private double width;
    private double height;

    Rectangle(String col, double w, double h)
    {
        color = col; 
	width = w; 
	height = h;
    }

    public String getColor()     
    { 
	return color; 
    }

    public void setColor(String c)
    { 
	color = c;
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

    public double getArea()       
    {
        return width*height;
    }
}
