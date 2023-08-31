
public class Demo
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(4);

        // How to make a COPY of the Circle circle1

        Circle circle2 = new Circle();       // (1) Make a new Circle object
        circle2.radius = circle1.radius;     // (2) Copy over the properties 

        // Code that shows circle1 and circle2 are 2 DIFFERENT Circle obejcs
        System.out.println("circle1.radius = " + circle1.radius);
        System.out.println("circle2.radius = " + circle2.radius);

        circle2.radius = 999;    // Update circle2 - MUST NOT affect circle1

        System.out.println("\nAfter updating circle2.radius:");
        System.out.println("circle1.radius = " + circle1.radius);
        System.out.println("circle2.radius = " + circle2.radius);
    }
}
