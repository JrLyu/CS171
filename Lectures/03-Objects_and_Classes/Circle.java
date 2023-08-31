public class Circle { // Class represents an object does not need a main method.

    public double radius = 1; // the radius of this circle;
    //also can use the private quantifier, but we need to write a getRadius method in order to print the radius later

    public Circle() {} // constructor 1 for a circle object

    public Circle(double newRadius) { // constructor 2 for a circle object
        radius = newRadius;
    }

    /* To test an object, we may include a main method inside this class,
     * but writing a separate class to test it is also desirable.
     * public static void main(String[] args) {
     *      Circle circle1 = new Circle();
     *      Circle circle2 = new Circle(2);
     * }
     */

    // DO NOT use the static quantifier: instance method can only use instance variables
    public double getArea() { // return the area of this circle
        return 3.14159 * radius * radius;
    }

    public void setRadius(double newRadius) { // set new radius for this circle; DO NOT use the static quantifier
        radius = newRadius;
    }
}
