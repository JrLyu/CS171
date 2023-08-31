import java.util.Arrays;

public class IntegerStack implements MyStackInterface<Integer>
{
    private Integer[] item;
    private int stackTop;

    public IntegerStack(int N)
    {
        item = new Integer[N];
        stackTop = 0;
    }

    public boolean isEmpty()  // returns true is stack is empty
    {
        return stackTop == 0;
    }

    public boolean isFull()   // returns true is stack is full
    {
        return stackTop == item.length;
    }

    public void push(Integer e)     // Pushes elem e on the stack
    {
        if ( isFull () )
        {
            System.out.println("Full");
            return ;
        }

        item[ stackTop ] = e; 
        stackTop++;
    }

    public Integer pop()            // Remove the elem at the top
    {
        if ( isEmpty() )
        {
            System.out.println("Empty");
            return null;
        }

        stackTop--;
        return item[ stackTop ];
    }

    public Integer peek()           // Return the elem at the top
    {
        if ( isEmpty() )
        {
            System.out.println("Empty");
            return null;
        }
        else
            return item[ stackTop-1 ];
    }

    @Override
    public String toString()
    {
        String s = ">>> ";

        for ( int i = 0; i < stackTop; i++ )
            s += item[i] + " ";

        return s;
    }
}
