
import java.util.Arrays;

public class PassReference
{
   public static void Method1( int[] x )
   {
      // Parameter x is a local variable x in Method1
      // x points to the SAME array as x in main !!!

      System.out.println( "Method1: x[1] before update = " + x[1] );
      x[1] = 4444;
      System.out.println( "Method1: x[1] after update  = " + x[1] );
   }

   public static void main(String[] args) 
   { 
      int[] x = {1, 2, 3, 4};   // Local variable x of main
				// x references to array {1, 2, 3, 4}

      System.out.println( "Main, before call: x[] = " + Arrays.toString(x) );
      Method1(x);		// Pass reference of array 
      System.out.println( "Main, after  call: x[] = " + Arrays.toString(x) );
   } 
}

