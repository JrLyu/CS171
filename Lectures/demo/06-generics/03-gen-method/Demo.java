
public class Demo
{
   public static void main(String[] args) 
   {
       String[]  strings  = {"a", "b", "c"};
       Integer[] integers = {1, 2, 3, 4, 5};
 
       print( strings );
       print( integers );
   }

   public static void print(String[] list)
   {
       System.out.println("Using print(String[])");

       for ( int i = 0; i < list.length; i++ )
           System.out.println(list[i]);
   }

   public static void print(Integer[] list)
   {
       System.out.println("Using print(Integer[])");

       for ( int i = 0; i < list.length; i++ )
           System.out.println(list[i]);
   }
}
