
public class Demo3
{
   public static void main(String[] args) 
   {
      ObjectStore a = new ObjectStore("Hello");
      ObjectStore b = new ObjectStore( 12345 );
    
      System.out.println(a.getData());	// Looks good...
      System.out.println(b.getData());
   }
}
