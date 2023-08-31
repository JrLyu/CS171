
public class NewClass extends SomeClass
{
    public int x;

    public NewClass()
    {
      super(); // Invokes SomeClass(). Do not write "SomeClass()" !
    }
    
    public NewClass(int a)
    {
      super(a); // Invokes SomeClass(int). Do not write "SomeClass()" !
    }
}
