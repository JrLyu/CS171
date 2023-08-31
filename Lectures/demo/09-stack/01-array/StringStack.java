

public class StringStack implements MyStackInterface<String>
{
     private String[] item;
     private int stackTop;

     public StringStack(int N)
     {
         item = new String[N];
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

     public void push(String e)     // Pushes elem e on the stack
     {
	if ( isFull () )
        {
	    System.out.println("Full");
	    return ;
        }

	item[ stackTop ] = e; 
	stackTop++;
     }

     public String pop()            // Remove the elem at the top
     {
	if ( isEmpty() )
        {
	    System.out.println("Empty");
	    return null;
        }

	String r = item[ stackTop-1 ];
	stackTop--;
	return r;
     }

     public String peek()           // Return the elem at the top
     {
	if ( isEmpty() )
        {
	    System.out.println("Empty");
	    return null;
        }
	else
	    return item[ stackTop-1 ];
     }

}
