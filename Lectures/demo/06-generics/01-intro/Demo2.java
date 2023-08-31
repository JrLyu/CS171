
public class Demo2
{
   public static void main(String[] args) 
   {
      IntegerStore a = new IntegerStore( 12345 );
    
      System.out.println(a.getData());

      // Java knows that a.getData() returns an Integer
      //    a.getData() + a.getData()will add
      System.out.println(a.getData() + a.getData());
   }
}
