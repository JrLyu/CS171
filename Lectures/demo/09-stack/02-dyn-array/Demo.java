public class Demo
{
    public static void main(String[] args)
    {
	IntegerStack s = new IntegerStack();

	s.pop();
	s.push(1);
	s.push(2);
	s.push(3);
	System.out.println( s );
	System.out.println( s.pop() );
	System.out.println( s );
	System.out.println( s.pop() );
	System.out.println( s );
	System.out.println( s.pop() );
	System.out.println( s );
    }

}
