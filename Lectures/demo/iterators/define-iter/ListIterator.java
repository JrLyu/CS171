
import java.util.Iterator;

public class ListIterator<T> implements Iterator<T> 
{
    Node<T> current;

    // initialize pointer to head of the list for iteration
    public ListIterator(List<T> list)
    {
        current = list.getHead();
    }

    // returns false if next element does not exist
    public boolean hasNext()
    {
        return current != null;
    }

    // return current data and update pointer
    public T next()
    {
        T data = current.getData();	// Save return value
        current = current.getNext();	// Advance pointer
        return data;			// Return saved ret val
    }

    // implement if needed
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}

