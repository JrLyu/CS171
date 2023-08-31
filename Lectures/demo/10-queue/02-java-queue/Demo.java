import java.util.*;

public class Demo
{
    public static void main(String[] args)
    {
	Queue<Integer> s = new ArrayDeque<>();

	s.add(1);
	System.out.println( s );
	s.add(2);
	System.out.println( s );
	s.add(3);
	System.out.println( s );
	s.add(99);
	System.out.println( s );

	System.out.println( s.remove() );
	System.out.println( s );
	System.out.println( s.remove() );
	System.out.println( s );

	s.add(4);
	System.out.println( s );
	s.add(5);
	System.out.println( s );
	s.add(6);
	System.out.println( s );

	System.out.println( s.remove() );
	System.out.println( s );
	System.out.println( s.remove() );
	System.out.println( s );
    }

}
