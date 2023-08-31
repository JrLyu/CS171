public class Demo
{
    public static void main(String[] args)
    {   
        NewClass b = new NewClass();
        
        // Put a break here
        b.method1(); // Invokes SomeClass.method1() !
        b.method2(); // Invokes SomeClass.method2() !
    }
}
