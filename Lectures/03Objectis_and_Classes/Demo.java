public class Demo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        Circle circle2 = new Circle(2);

        double area1 = circle1.getArea(); // Tell circle1 to run getArea()
        System.out.println("Area of circle1 = " + area1);

        double area2 = circle2.getArea(); // Tell circle2 to run getArea()
        System.out.println("Area of circle2 = " + area2);

        circle1.setRadius(5); // Tell circle1 to run setRadius to change the radius of circle1
        /* Do not use
        * circle1.radius = 5;
        * Because our radius variable was set public.
        * Running this line of the code will change the value of radius directly, which means
        * the sequential circle constructed will automatically contain a radius of 5.
        * To prevent this circumstances, set radius to private.
        *
        * If we set radius to private, then running circle1.radius = 5; will yield a compile error.
        */

        double area3 = circle1.getArea();
        System.out.println("New area of circle1 = " + area3);
    }
}