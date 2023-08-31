import java.util.Arrays;

public class IntegerStack implements MyStackInterface<Integer>
{
    private Integer[] item;
    private int stackTop;
    private final double DELTA = 0.5;

    public IntegerStack()	// Initially, start with a stack of 1 elem
    {
        item = new Integer[1];
	stackTop = 0;
    }

    public boolean isEmpty()  	// returns true is stack is empty
    {
	return stackTop == 0;
    }

    public boolean isFull()   	// returns true is stack is full
    {
	return stackTop == item.length;
    }

    public void push(Integer e)     // Pushes elem e on the stack
    {
	if ( isFull () )	// Double the array size
        {   
	    System.out.println("Doubling the stack: " + 
			item.length + " --> " + 2*item.length);

	    Integer[] temp = new Integer[2*item.length];

	    for ( int i = 0; i < item.length; i++ )
		temp[i] = item[i];

	    item = temp;
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
	Integer retVal = item[ stackTop ];	// Save return value

	if ( stackTop <= DELTA*item.length && item.length >= 2)
	{
	      System.out.println("Halving the stack: " + 
			item.length + " --> " + item.length/2);

              Integer[] temp = new Integer[ item.length/2 ];

	      for ( int i = 0; i < stackTop; i++ )
	          temp[i] = item[i];

              item = temp;
	}

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
