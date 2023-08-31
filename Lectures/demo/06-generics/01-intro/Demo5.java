
public class Demo5
{
   public static void main(String[] args) 
   {
      ObjectStore a = new ObjectStore("Hello");
      ObjectStore b = new ObjectStore( 12345 );
    
      System.out.println(   (String)  a.getData() 
                          + (String)  a.getData()   ); 
      System.out.println(   (Integer) b.getData() 
                          + (Integer) b.getData()   );
   }
}
