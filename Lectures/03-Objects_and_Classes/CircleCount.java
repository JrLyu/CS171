public class CircleCount {
    public double radius = 1; // An instance variable
    public static int count; // A static variable

    public CircleCount() { }

    public CircleCount(double newRadius) {
        radius = newRadius;
    }

    public double getArea() {
        return 3.14159 * radius * radius;
    }

    public void setReadius(double newRadius) {
        radius = newRadius;
    }
}
