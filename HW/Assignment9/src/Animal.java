public class Animal implements Comparable<Animal> {
    private String name;
    private double weight;

    public Animal(String n, double w) {
        name = n;
        weight = w;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "(" + name + " " + weight + ")";
    }

    @Override
    public int compareTo(Animal o) {
        if (this instanceof Bird) {
            if (o instanceof Bird) {
                return 0;
            } else if (o instanceof Cat) {
                return -1;
            } else if (o instanceof Dog) {
                return -1;
            }
        } else if (this instanceof Cat) {
            if (o instanceof Bird) {
                return 1;
            } else if (o instanceof Cat) {
                return 0;
            } else if (o instanceof Dog) {
                return -1;
            }
        } else if (this instanceof Dog) {
            if (o instanceof Bird) {
                return 1;
            } else if (o instanceof Cat) {
                return 1;
            } else if (o instanceof Dog) {
                return 0;
            }
        }
        return 0;
    }
}
