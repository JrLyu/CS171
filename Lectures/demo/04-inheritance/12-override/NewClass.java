public class NewClass extends SomeClass
{
    NewClass(int a)
    {
        super(a);
    }

    // Inherits: method1()  and method2()

    public void method1( )    // Overrides method1()
    {
        System.out.println("NewClass.m1()");
    }

    public void method3()
    {
        method1();       // Invokes NewClass  method1
        super.method1(); // Invoked SomeClass method1()  
    }
} 
