public class Demo
{
    public static void main(String[] args)
    {
        SomeClass a = new SomeClass();
        a.method1();
        a.method2();
  //    a.method3();  // ILLEGAL !!
        
        NewClass b = new NewClass();
        b.method1(); // Trace this with BlueJ
        b.method2(); // Trace this with BlueJ
        b.method3(); // Trace this with BlueJ
    }
}
