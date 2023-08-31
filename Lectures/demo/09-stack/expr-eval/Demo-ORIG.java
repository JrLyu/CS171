
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
		// Finish the TERM (+ or -) if any
	        if ( !operator.empty() )
	        {
	            int o2 = operand.pop();
                    int o1 = operand.pop();
                    String op = operator.pop();

                    if ( op.equals("+") )
	            {
                        System.out.println(">>>" + o1 + " + " + o2);
                        operand.push( o1+o2 );
	            }
                    else if ( op.equals("-") )
	            {
                        System.out.println(">>>" + o1 + " - " + o2);
                        operand.push( o1-o2 );
	            }
                    else
                        System.out.println("Illegal operator");
	        }
	    }
	    else if ( s.equals("x") )
	    {
		operand.push( Integer.parseInt( args[++i] ) );
		int o2 = operand.pop();
		int o1 = operand.pop();
	        System.out.println(">>>" + o1 + " * " + o2);
		operand.push( o1*o2 );
	    }
	    else if ( s.equals("/") )
	    {
		operand.push( Integer.parseInt( args[++i] ) );
		int o2 = operand.pop();
		int o1 = operand.pop();
	        System.out.println(">>>" + o1 + " / " + o2);
		operand.push( o1/o2 );
	    }
            else if ( s.equals("+") || s.equals("-") )
            {
		if ( operator.empty() )
		{
		    operator.push(s); 	// Save it
		}
		else
		{
                    int o2 = operand.pop();
                    int o1 = operand.pop();
		    String op = operator.pop();	// Do this first

		    if ( op.equals("+") )
		    {
	               System.out.println(">>>" + o1 + " + " + o2);
                       operand.push( o1+o2 );
		    }
		    else if ( op.equals("-") )
		    {
	               System.out.println(">>>" + o1 + " - " + o2);
                       operand.push( o1-o2 );
		    }
		    else
		       System.out.println("Illegal operator");

		    operator.push(s);	// Then this...
		}
            }
	    else
	    {   // s is an operand...
		operand.push( Integer.parseInt(s) );
	    }
	}

	if ( !operator.empty() )
	{
	    int o2 = operand.pop();
            int o1 = operand.pop();
            String op = operator.pop();

            if ( op.equals("+") )
	    {
                System.out.println(">>>" + o1 + " + " + o2);
                operand.push( o1+o2 );
	    }
            else if ( op.equals("-") )
	    {
                System.out.println(">>>" + o1 + " - " + o2);
                operand.push( o1-o2 );
	    }
            else
                System.out.println("Illegal operator");
	}

	System.out.println( operand.pop() );
    }
}

