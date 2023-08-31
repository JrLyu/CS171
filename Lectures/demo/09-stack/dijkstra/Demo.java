
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
	Stack<String>  operator = new Stack<>();

	for ( int i = 0; i < args.length; i++ )
	{
	    s = args[i];
	    System.out.println(">" + s);

	    if ( s.equals("(") )
	    {
		// Do nothing... wait for a ")"
	    }
	    else if ( s.equals(")") )
	    {
		if ( operator.empty() )
		{
		    System.out.println("*** not possible");
		    continue;
		}

		// Eval 1 expression
		int o2 = operand.pop();
		int o1 = operand.pop();
                String op = operator.pop();

		int r = operate(op, o1, o2);

	        operand.push( r );
            }
	    else if ( s.equals("x") || s.equals("/") ||
		      s.equals("+") || s.equals("-")     )
                operator.push( s );
	    else
                operand.push( Integer.parseInt(s) );
	}

	System.out.println( operand.pop() );
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

