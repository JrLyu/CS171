
public class Demo3
{
    public static void main(String[] args)
    {
        int[] a = new int[10];

	// Index out of range
	try
	{
	    a[99] = 1;
	}
	catch (Exception e)
	{
	    System.out.println(e);
	    System.out.println("DONE");
	}
    }
}
