/* =================================================
   Implementation of Queue using a circular buffer
   ================================================= */

import java.util.Arrays;

public class IntegerQueue implements MyQueueInterface<Integer>
{
    private Integer[] buf;
    private int read;
    private int write;

    public IntegerQueue(int N)
    {
        buf = new Integer[N];
        read = 0;
        write = 0;
    }

    public boolean isEmpty()  // returns true is queue is empty
    {
        return read == write;
    }

    public boolean isFull()   // returns true is queue is full
    {
        return (write+1)%buf.length == read;
    }

    public void enqueue(Integer e)     // 
    {
        if ( isFull () )
        {
            System.out.println("Full");
            return ;
        }

        buf[ write ] = e; 
        write = (write+1)%buf.length;
    }

    public Integer dequeue()            // 
    {
        if ( isEmpty() )
        {
            System.out.println("Empty");
            return null;
        }

        Integer retVal = buf[ read ];
        read = (read+1)%buf.length;
	return retVal;
    }

    public Integer peek()           // Return the elem at the top
    {
        if ( isEmpty() )
        {
            System.out.println("Empty");
            return null;
        }
        else
            return buf[ read ];
    }

    @Override
    public String toString()
    {
        String s = ">>> ";

	int i = read;

	while ( i != write )
	{
            s += buf[i] + " ";
	    i = (i+1)%buf.length;
	}
        return s;
    }
}
