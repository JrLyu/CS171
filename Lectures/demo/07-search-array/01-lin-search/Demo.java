
public class Demo
{
    /* ----------------------------------------------------
       The linear search algorithm to find key
       in the array list
       ---------------------------------------------------- */
    public static int linearSearch(int[] list, int key)
    {
        for ( int i = 0; i < list.length; i++ )
	   if ( list[i] == key )
	       return i;

        // key was not found in list[]
	return -1;
    }

    /* ----------------------------------------
       Test program
       ---------------------------------------- */
    public static void main(String[] args)
    {
        int[] myList = {1, 4, 4, 2, 5, -3, 6, 2};

	System.out.println( linearSearch(myList,  4) ); //  1
	System.out.println( linearSearch(myList, -4) ); // -1
	System.out.println( linearSearch(myList, -3) ); //  5
    }
}
