public class Cat extends Animal {
    public Cat(String n, double w) {
        super(n, w);
    }

    public int compareTo(Animal o) {
        if (o instanceof Cat) {
            return (int)(this.getWeight() - o.getWeight());
        }
        else {
            return super.compareTo(o);
        }
    }
}
