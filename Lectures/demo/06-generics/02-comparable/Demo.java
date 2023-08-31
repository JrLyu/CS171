
public class Demo
{
    public static void main(String[] args)
    {
         BankAccount[] myList = new BankAccount[4];
         
         myList[0] = new BankAccount(400);
         myList[1] = new BankAccount(300);
         myList[2] = new BankAccount(500);
         myList[3] = new BankAccount(200);
         
         for ( int i = 0; i < myList.length; i++ )
             System.out.print( myList[i].getBalance() + " ");
	 System.out.println();

         selectionSort( myList );  // Uses upcasting !

         for ( int i = 0; i < myList.length; i++ )
             System.out.print( myList[i].getBalance() + " ");
	 System.out.println();
    }

    public static <T extends ComparableThing<T>> void selectionSort(T[] list) 
    {
        for (int i = 0; i < list.length-1; i++)
        {
            /* -----------------------------------------------
               Find the minimum in the list[i..list.length-1]
               ----------------------------------------------- */
           T  min = list[i];    // Assume first element is min
           int minIndex        = i;          // Index where min is found

           for ( int k = minIndex+1; k < list.length; k++ )
               if ( list[k].compareTo(min) < 0 ) // compare list[k] and min
               { 
                   min      = list[k]; // Update min value
                   minIndex = k;       // Update its index
               }

            /* ------------------------------------------------------
               Swap list[i] with list[minIndex] if necessary
               ------------------------------------------------------ */
            if ( minIndex != i )
            {   // Swap list[minIndex] and list[i]
                T help = list[minIndex]; // Standard exchange alg
                list[minIndex]       = list[i];
                list[i]              = help;
            }
        }
    }
}
