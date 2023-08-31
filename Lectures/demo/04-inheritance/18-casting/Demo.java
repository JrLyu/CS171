
public class Demo
{
    public static void main(String[] args)
    {
        // The "normal way" to access member in NewClass
        NewClass a = new NewClass();	// Using a NewClass ref var
        
        System.out.println(a.x);
        a.method1();
        a.method2();
        a.method3();

        System.out.println();

        // New way to access member in NewClass
        SomeClass b = new NewClass();   // Use a SUPERCLASS variable
        System.out.println(b.x);
        b.method1();	// Invokes NewClass method1
        b.method2();	// Invokes inherited SomeClass method2

     // b.method3();    // This an inapproprate request using b !
    }
} 
