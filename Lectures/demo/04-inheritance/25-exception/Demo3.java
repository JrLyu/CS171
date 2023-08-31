
public class Demo2
{
    public static void main(String[] args)
    {
        int[] a = new int[10];

	// Index out of range
	try
	{
	    // a = null;
	    a[99] = 1;
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
	    System.out.println("(1)" + e);
	    System.out.println("DONE");
	}
	catch (Exception e)
	{
	    System.out.println("(2)" + e);
	    System.out.println("DONE");
	}
    }
}
