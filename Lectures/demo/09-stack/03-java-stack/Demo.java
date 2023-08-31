
import java.util.Stack;


public class Demo
{
    public static void main(String[] args)
    {
	Stack<Integer> iStack = new Stack<>();
	Stack<String>  sStack = new Stack<>();

	iStack.push(1);
	iStack.push(2);
	iStack.push(3);
	System.out.println( iStack );

	System.out.println( iStack.pop() );
	System.out.println( iStack );

	sStack.push("cat");
	sStack.push("dog");
	System.out.println( sStack );

	System.out.println( sStack.pop() );
	System.out.println( sStack );
    }

}
