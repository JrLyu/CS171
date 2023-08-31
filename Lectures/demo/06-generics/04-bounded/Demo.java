
public class Demo
{
    public static void main(String[] args)
    {
	Circle c1 = new Circle("red", 1);
	Rectangle r1 = new Rectangle("red", 1, 1);
        // Integer x = 4;

        System.out.println( equalArea( c1, c1 ) );
        System.out.println( equalArea( r1, r1 ) );
        System.out.println( equalArea( c1, r1 ) );
        System.out.println( equalArea( r1, c1 ) );

        // System.out.println( equalArea( x, c1 ) );
    }

    public static <T extends GeometricObject> boolean equalArea( T o1, T o2 )
    {
        return o1.getArea() == o2.getArea();
    }
}
