
public class Demo
{
   public static void main(String[] args)
   {
       int[] myList = {8, 4, 9, 7, 3, 5, 6, 1, 2};

       for ( int i = 0; i < myList.length; i++)
           System.out.print(myList[i]+ " ");
       System.out.println();

       selectionSort(myList);

       for ( int i = 0; i < myList.length; i++)
           System.out.print(myList[i]+ " ");
       System.out.println();
   }

    public static void selectionSort(int[] list) 
    {
        for (int i = 0; i < list.length - 1; i++) 
	{
            /* -----------------------------------------------
               Find the minimum in the list[i..list.length-1]
	       ----------------------------------------------- */
           int min      = list[i];     // Assume first element is min
           int minIndex = i;           // Index where min is found

           for ( int k = minIndex+1; k < list.length; k++ )
               if ( list[k] < min )    // Found a smaller element
               {
                   min      = list[k]; // Update min value
                   minIndex = k;       // Update index
               }
  
	    /* ------------------------------------------------------
               Swap list[i] with list[minIndex] if necessary;
	       ------------------------------------------------------ */
	    if ( minIndex != i ) 
	    {   // Swap list[minIndex] and list[i]
	        int help       = list[minIndex];
                list[minIndex] = list[i];
		list[i]        = help;
            }
        }
    }
}
