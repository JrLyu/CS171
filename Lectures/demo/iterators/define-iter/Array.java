
import java.util.Iterator;

class Array<T> implements Iterable<T> 
{
    Object[]  data = new Object[10];
    int       N = 0;

    // add new Element at tail of the linked list in O(1)
    public void add(T data)
    {
        this.data[N++] = data;
    }

    // return Iterator instance
    public Iterator<T> iterator()
    {
        return new ArrayIterator<T>(this);
    }
}


