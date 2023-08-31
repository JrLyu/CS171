
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

	    if ( isOp(s) )
	    {
		if ( operator.isEmpty() )	// No operator to compare
		    operator.push( s );		// Wait to evaluate op s
		else
		{   // Try to finish the last operation on the stack

		    String op1 = operator.peek();
		    if ( compareTo(op1, s) < 0 )
		    {
			operator.push(s);
			continue;		// Wait to evaluate op s
		    }

		    // We can finish the last operation on the stack
		    int o2 = operand.pop();
		    int o1 = operand.pop();
		    op1 = operator.pop();

		    int r = operate( op1, o1, o2);

		    operand.push(r);
		    operator.push(s);
		}
	    }
	    else 
	    {   // s is an operand...
		operand.push( Integer.parseInt(s) );
	    }
	}

        while ( !operator.empty() )
        {
            int o2 = operand.pop();
            int o1 = operand.pop();
            String op = operator.pop();

	    int r = operate(op, o1, o2);
	    operand.push(r);
	}

	System.out.println( operand.pop() );
    }

    public static boolean isOp(String s)
    {
	return s.equals("x") || s.equals("/") 
               || s.equals("+")  || s.equals("-") ;
    }

    public static int compareTo(String op1, String op2)
    {
	int r1, r2;  // Priority rank

        if ( op1.equals("x") || op1.equals("/") )
	    r1 = 1;
	else
	    r1 = 0;

        if ( op2.equals("x") || op2.equals("/") )
            r2 = 1;
        else
            r2 = 0;

	return r1 - r2;
    }


    public static int operate(String op, int o1, int o2)
    {
	switch ( op.charAt(0) )
	{
	    case 'x': 
			System.out.println(">>> " + o1 + " * " + o2);
			return o1 * o2;
	    case '/': 
			System.out.println(">>> " + o1 + " / " + o2);
			return o1 / o2;
	    case '+': 
			System.out.println(">>> " + o1 + " + " + o2);
			return o1 + o2;
	    case '-': 
			System.out.println(">>> " + o1 + " - " + o2);
			return o1 - o2;

	    default: System.out.println("Illegal operation: " + op);
		     return 0;
	}
    }
}

