
public class NewClass extends SomeClass
{
    public int x;      // Inherits x, and defines another variable x

    public NewClass(int a)
    {
       super(a-1);	// Init super.x = a - 1
       x = a;
    }

    public void print()
    {
        System.out.println("NewClass x = " + x);
        super.print();
    }
}
