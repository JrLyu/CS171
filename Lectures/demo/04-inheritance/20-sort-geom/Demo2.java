
public class Demo2
{
   public static void main(String[] args)
   {
        Rectangle[] myList = new Rectangle[4]; // Array of Rectangles objs
        myList[0] = new Rectangle("red", 2, 1);
        myList[1] = new Rectangle("blue", 1, 1);
        myList[2] = new Rectangle("white", 5, 1);
        myList[3] = new Rectangle("black", 3, 2);
 
        System.out.println("Before sorting:");
        for ( int i = 0; i < myList.length; i++)
           System.out.println(myList[i]);
        System.out.println();

        selectionSort(myList);

        System.out.println("After sorting:");
        for ( int i = 0; i < myList.length; i++)
           System.out.println(myList[i]);
   }

    public static void selectionSort(Rectangle[] list) 
    {
        for (int i = 0; i < list.length - 1; i++) 
	{
            /* -----------------------------------------------
               Find the minimum in the list[i..list.length-1]
	       ----------------------------------------------- */
           Rectangle min = list[i];     // Assume first element is min
           int minIndex  = i;           // Index where min is found

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
	        Rectangle help = list[minIndex];
                list[minIndex] = list[i];
		list[i]        = help;
            }
        }
    }
}
