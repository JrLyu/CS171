
public class Demo
{
   public static Node first;	// reference to linked list of Node objects

   public static void main(String[] args)
   {
      // Create nodes with data
      Node help1 = new Node();
      help1.item = "to";

      Node help2 = new Node();
      help2.item = "be";

      Node help3 = new Node();
      help3.item = "or";

      // Chain the nodes together using "next"
      help1.next = help2;
      help2.next = help3;
      help3.next = null;    // null marks the end of the list

      // Important: first must ALWAYS reference to the first elem in list
      first = help1;	    // Done !!!

      /* ----------------------------------------------
         Print out the list  **** Discussed next ****
	 ---------------------------------------------- */
      Node p;

      p = first;
      while (p != null )
      {
          System.out.println(p.item);
	  p = p.next;
      }
   }
}
