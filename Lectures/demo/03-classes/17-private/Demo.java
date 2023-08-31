

public class Demo
{
    public static void main(String[] args)
    {
        C1 o = new C1();  // Make a C1 object

	o.x1 = 1; // Access  a public  variable
	o.x2 = 1; // Access  a private variable    -- Error
	o.m1();   // Invokes a public  method
	o.m2();   // Invokes a private method      -- Error
    }
}
