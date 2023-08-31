
public class Demo
{
   public static void main(String[] args)
   {
        Circle[] myList = new Circle[4]; // Array of Circles objs
        myList[0] = new Circle("red", 2);
        myList[1] = new Circle("blue", 1);
        myList[2] = new Circle("white", 5);
        myList[3] = new Circle("black", 3);
 
        System.out.println("Before sorting:");
        for ( int i = 0; i < myList.length; i++)
           System.out.println(myList[i]);
        System.out.println();

        selectionSort(myList);

        System.out.println("After sorting:");
        for ( int i = 0; i < myList.length; i++)
           System.out.println(myList[i]);
   }

    public static void selectionSort(Circle[] list) 
    {
        for (int i = 0; i < list.length - 1; i++) 
	{
            /* -----------------------------------------------
               Find the minimum in the list[i..list.length-1]
	       ----------------------------------------------- */
           Circle min   = list[i];     // Assume first element is min
           int minIndex = i;           // Index where min is found

           for ( int k = minIndex+1; k < list.length; k++ )
               if ( list[k].getArea() < min.getArea() ) // Found smaller element
               {
                   min      = list[k]; // Update min value
                   minIndex = k;       // Update index
               }
  
	    /* ------------------------------------------------------
               Swap list[i] with list[minIndex] if necessary;
	       ------------------------------------------------------ */
	    if ( minIndex != i ) 
	    {   // Swap list[minIndex] and list[i]
	        Circle help    = list[minIndex];
                list[minIndex] = list[i];
		list[i]        = help;
            }
        }
    }
}
