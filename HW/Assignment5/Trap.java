// Trap can trap any class of object T
public class Trap<T> {
    private T trapped;

    public Trap() {
        trapped = null;
    }

    public Trap(T t) {
        trapped = t;
    }

    // Write the snare() method here
    public boolean snare(T x) {
        if (this.trapped == null) {
            trapped = x;
            return true;
        } else {
            return false;
        }
    }

    // Write the release() method here
    public T release() {
        if (this.trapped != null) {
            T result = trapped;
            trapped = null;
            return result;
        }
        return null;
    }
}