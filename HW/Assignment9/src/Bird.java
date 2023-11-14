public class Bird extends Animal {
    public Bird(String n, double w) {
        super(n, w);
    }

    public int compareTo(Animal o) {
        if (o instanceof Bird) {
            return (int)(this.getWeight() - o.getWeight());
        }
        else {
            return super.compareTo(o);
        }
    }
}
