
public class NewClass extends SomeClass
{
    public int x;

    public NewClass()
    {
       // Does not invoke super() --> Java will insert "default constructor"
    }
    
    public NewClass(int a)
    {
      super(a); // Invokes SomeClass(int). Do not write "SomeClass()" !
    }
}
