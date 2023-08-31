public class Methods3
{
   public static void M1( int x )
   {
      // Parameter x is actually a local variable x in M1

      System.out.println( "M1's parameter x before update = " + x );
      x = 4444;
      System.out.println( "M1's parameter x after update  = " + x );
   }

   public static void main(String[] args) 
   { 
      int x = 1;          // Local variable x of main

      System.out.println( "Main's x = " + x );
      M1(x);
      System.out.println( "Main's x after M1 update = " + x );
   } 
}

