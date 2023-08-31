
public class Demo2
{
    public static void main(String[] args)
    {
        SomeClass a;	// Superclass variable
        
	a = new SomeClass();
        a.method1();		// (1) calls SomeClass.method1

        System.out.println();

	a = new NewClass();
        a.method1();		// (2) Same expression
				//     but calls NewClass.method1
    }
} 
