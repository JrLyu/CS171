
public class Demo
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle("red", 2);
        Circle c2 = new Circle("blue", 4);
        
        Rectangle r1 = new Rectangle("green", 2, 3);
        Rectangle r2 = new Rectangle("red", 1, 4);
        
        System.out.println( c1.getColor() + " " + c1.getArea() );
        System.out.println( c2.getColor() + " " + c2.getArea() );
        System.out.println( r1.getColor() + " " + r1.getArea() );
        System.out.println( r2.getColor() + " " + r2.getArea() );
    }
}
