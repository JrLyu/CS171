
public class Demo
{
    public static void main(String[] args)
    {
	// Abstract classes usually serve as superclass for polymorphism

        GeometricObject a = new Circle("red", 2); 
        GeometricObject b = new Rectangle("blue", 2, 3); 

	System.out.println( a.getArea() );
	System.out.println( b.getArea() );
    }
}
