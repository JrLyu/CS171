
public class Demo2
{
   public static void main(String[] args) 
   {
       String[]  strings  = {"a", "b", "c"};
       Integer[] integers = {1, 2, 3, 4, 5};
 
       Demo2.<String>print( strings );
       Demo2.<Integer>print( integers );
   }

   public static <T> void print( T[] list )
   {
       System.out.println("Using print(String[])");

       for ( int i = 0; i < list.length; i++ )
           System.out.println(list[i]);
   }
}
