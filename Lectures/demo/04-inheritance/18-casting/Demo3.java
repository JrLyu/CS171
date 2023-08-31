
public class Demo3
{
    public static void main(String[] args)
    {
        NewClass a;		// NewClass ref var
        
	a = new SomeClass();	// Illegal 
				// Because SomeClass() cannot 
				// support "a.method3()" request
    }
} 
