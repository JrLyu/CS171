
public class Demo
{
    public static void main(String[] args) 
    {
	// Call order: main -> a
	a();
    }

    static void a() 
    {
	// Call order: a -> b
	b();
    }
    static void b() 
    {
	// Call order: b -> c
	c();
    }
    static void c() 
    {
	// Call order: c -> d
	d();
    }

    static void d() 
    {
	// This will print out the call order....
	throw new NullPointerException();
    }
}
