public class PassPrimitive
{
   public static void Method1( int x )
   {
      // Parameter x is actually a local variable x in Method1

      System.out.println( "Method1's parameter x before update = " + x );
      x = 4444;
      System.out.println( "Method1's parameter x after update  = " + x );
   }

   public static void main(String[] args) 
   { 
      int x = 1;          // Local variable x of main

      System.out.println( "Main's x = " + x );
      Method1(x);
      System.out.println( "Main's x after Method1 update = " + x );
   } 
}

