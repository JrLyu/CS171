/* --------------------------------------------------------------
   This is harder because you have to create a generic array

   Still working on it.
   ------------------------------------------------------------- */

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> 
{
    Node<T>[] array;
    int       N;
    int       k;

    // initialize pointer to head of the list for iteration
    public ArrayIterator(Node<T>[] list)
    {
        array = (Node<T>[]) list.data;
	N = list.N;
	k = 0;
    }

    // returns false if next element does not exist
    public boolean hasNext()
    {
        return k != N;
    }

    // return current data and update pointer
    public T next()
    {
        T data = array[k];              // Save return value
        k++;	                        // Advance pointer
        return data;			// Return saved ret val
    }

    // implement if needed
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}

