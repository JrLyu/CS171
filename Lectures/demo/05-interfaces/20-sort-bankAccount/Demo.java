
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

        selectionSort(myList);

        for ( int i = 0; i < myList.length; i++ )
            System.out.print( myList[i].getBalance() + " ");
        System.out.println();
    }

    public static void selectionSort(BankAccount[] list) 
    {
        for (int i = 0; i < list.length - 1; i++) 
        {
            /* -----------------------------------------------
               Find the minimum in the list[i..list.length-1]
               ----------------------------------------------- */
           BankAccount min   = list[i]; // Assume first element is min
           int minIndex = i;            // Index where min is found

           for ( int k = minIndex+1; k < list.length; k++ )
               if ( list[k].compareTo(min) < 0 ) // Found smaller element
               {
                   min      = list[k]; // Update min value
                   minIndex = k;       // Update index
               }
  
            /* ------------------------------------------------------
               Swap list[i] with list[minIndex] if necessary;
               ------------------------------------------------------ */
            if ( minIndex != i ) 
            {   // Swap list[minIndex] and list[i]
                BankAccount help = list[minIndex];
                list[minIndex]   = list[i];
                list[i]          = help;
            }
        }
    }
}
