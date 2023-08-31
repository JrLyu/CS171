
public class Demo2
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(4);

        // COMMON MISTAKE in copying objects
        Circle circle2;

        circle2 = circle1;      // This copies a reference
                                // DOES NOT make a new COPY

        // Code that shows circle1 and circle2 are the SAME Circle object
        System.out.println("circle1.radius = " + circle1.radius);
        System.out.println("circle2.radius = " + circle2.radius);

        circle2.radius = 999;         // Update circle2 - ALSO affects circle1

        System.out.println("\nAfter updating circle2.radius:");
        System.out.println("circle1.radius = " + circle1.radius);
        System.out.println("circle2.radius = " + circle2.radius);
    }
}
