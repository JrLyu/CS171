
import java.util.Iterator;


// Driver class
public class Demo
{
    public static void main(String[] args)
    {
        // Create Linked List
        List<String> myList = new List<>();

        // Add Elements
        myList.add("abc");
        myList.add("mno");
        myList.add("pqr");
        myList.add("xyz");

        // Iterate through the list using For Each Loop
        for (String string : myList)
            System.out.println(string);

        System.out.println();

	Iterator<String> iter = myList.iterator();
 	while ( iter.hasNext() )
            System.out.println(iter.next() );
    }
}

