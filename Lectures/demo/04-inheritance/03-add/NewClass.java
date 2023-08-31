
public class NewClass extends SomeClass
{
    NewClass()    // Constructor
    {
        
    }

    public void method1( )  // **Overrides** the inherited method1
    {
        System.out.println("I am **NewClass**.method1(). x = " + x);
    }

    public void method3( )  // Defines a new method
    {
        System.out.println("I am **NewClass**.**method3**(). x = " + x);
    }
}

