public class Dog extends Animal {
    public Dog(String n, double w) {
        super(n, w);
    }

    public int compareTo(Animal o) {
        if (o instanceof Dog) {
            return (int)(this.getWeight() - o.getWeight());
        }
        else {
            return super.compareTo(o);
        }
    }
}
