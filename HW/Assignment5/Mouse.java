// Mouse is a subclass of Animal
public class Mouse extends Animal implements MyComparable{
    Mouse(String n, String s, double w) {
        super(n, s, w);
    }

    @Override
    public boolean isLessThan(MyComparable x) {
        Animal other = (Animal) x;
        return this.getWeight() < other.getWeight();
    }
}