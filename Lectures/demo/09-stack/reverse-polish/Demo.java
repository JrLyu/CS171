
/* ==========================================================
   This demo program uses Java's generic Stack class
   ========================================================== */
import java.util.Stack;

public class Demo
{
    public static void main(String[] args)
    {
	String s;
	Stack<Integer> operand = new Stack<>();

	for ( int i = 0; i < args.length; i++ )
	{
	    s = args[i];			// Next input (as String !)
	    System.out.println(">" + s);

	    if ( s.equals("x") || s.equals("/") ||
		 s.equals("+") || s.equals("-")     )
	    {
                // Symbol is an operator

		int o2 = operand.pop();     // Get the last 2 operands
		int o1 = operand.pop();

		int r = operate(s, o1, o2); // Perform operation
	        operand.push( r );	    // Save result on stack
	    }
	    else
                // Symbol is an number (i.e.: operand)
                operand.push( Integer.parseInt(s) ); // Save it as Integer
	}

	System.out.println( operand.pop() ); // Print result (saved on stack)
    }

    public static int operate( String op, int o1, int o2 )
    {

        if ( op.equals("x") )
        {
            System.out.println(">>>" + o1 + " * " + o2);
	    return( o1*o2 );
        }
        else if ( op.equals("/") )
        {
            System.out.println(">>>" + o1 + " / " + o2);
	    return( o1/o2 );
        }
	else if ( op.equals("+") )
	{
            System.out.println(">>>" + o1 + " + " + o2);
            return( o1+o2 );
	}
	else if ( op.equals("-") )
	{
	    System.out.println(">>>" + o1 + " - " + o2);
            return( o1-o2 );
	}
	else
	    return 0;
    }
}

