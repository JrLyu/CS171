
public class demo
{
   public static void main(String[] args)
   {
	stack<Integer> s = new stack<Integer>();

	s.push(1);
	s.push(2);

	System.out.println( s.pop() );
	System.out.println( s.pop() );
	s.push(3);
	s.push(5);
	System.out.println( s.pop() );
	System.out.println( s.pop() );
   }
}
