
public class Demo
{
    public static void main(String[] args)
    {
        int[] a = new int[10];

	// Index out of range
	try
	{
	    a[99] = 1;
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
	    System.out.println(e);
	    System.out.println("DONE");
	}
    }
}
