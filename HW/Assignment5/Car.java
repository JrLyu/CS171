public class Car {
    private String name;
    private String sound;
    private double weight;

    public Car(String n, String s, double w) {
        name = n;
        sound = s;
        weight = w;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return name + " - " + sound;
    }
}
