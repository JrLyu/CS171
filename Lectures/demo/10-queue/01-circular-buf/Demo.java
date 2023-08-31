public class Demo
{
    public static void main(String[] args)
    {
	IntegerQueue s = new IntegerQueue(4);

	s.dequeue();
	s.enqueue(1);
	System.out.println( s );
	s.enqueue(2);
	System.out.println( s );
	s.enqueue(3);
	System.out.println( s );
	s.enqueue(99);
	System.out.println( s );

	System.out.println( s.dequeue() );
	System.out.println( s );
	System.out.println( s.dequeue() );
	System.out.println( s );

	s.enqueue(4);
	System.out.println( s );
	s.enqueue(5);
	System.out.println( s );
	s.enqueue(6);
	System.out.println( s );

	System.out.println( s.dequeue() );
	System.out.println( s );
	System.out.println( s.dequeue() );
	System.out.println( s );
    }

}
