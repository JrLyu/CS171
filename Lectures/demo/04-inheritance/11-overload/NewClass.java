public class NewClass extends SomeClass
{
    NewClass(int a)
    {
        super(a);
    }

    // Inherits: method1()  and method2()

    public void method1(int a) // Overloads method1()
    {
        System.out.println("NewClass.m1(int)");
    }

    public void method3()
    {
        method1();   // Invokes SomeClass method1
        method1(22); // Invoked NewClass method1(int)  
    }
} 
