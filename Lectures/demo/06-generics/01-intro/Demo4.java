
public class Demo4
{
   public static void main(String[] args) 
   {
      ObjectStore a = new ObjectStore("Hello");
      ObjectStore b = new ObjectStore( 12345 );
    
      System.out.println(a.getData() + a.getData());  // Why fail ?????
      System.out.println(b.getData() + b.getData());  // Why fail ?????
   }
}
