public class NewClass extends SomeClass
{
    public void method1(double x)    // Overrides method1(double)
    {
        System.out.println("***************");
        System.out.println("x = " + x);
    }

    public void method3()
    {
        method1(4.0); 
        method1(4);  
    }
} 
