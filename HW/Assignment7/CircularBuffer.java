
public class CircularBuffer<T> implements DEQueue<T> {
    private T[] buf;
    private int read;
    private int write;

    // Write the constructor here
    public CircularBuffer(int n) {
        buf = (T[]) new Object[n];
        read = 0;
        write = 0;
    }

    // Write the other method used to implement the DEQueue<T> interface here
    @Override
    public boolean isEmpty() {
        return read == write;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void addFirst(T t) {

    }

    @Override
    public void addLast(T t) {

    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    /* ----------------------------------------------------
       toString() returns a string representation of
       the CircularBuffer object

       *** DO NOT modify this method ****
       ---------------------------------------------------- */
    public String toString() {
        String s = "";
        if (read == write) {
            return s;
        }
        for (int i = read; i != write; i = (i+1)%buf.length) {
            s = s + " " + buf[i];
        }
        return s;
    }
}

